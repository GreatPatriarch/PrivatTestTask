package com.privat.service;

import com.privat.entity.User;
import com.privat.exception.UserAlreadyExistsException;
import com.privat.repository.UserRepository;
import com.privat.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User addUser(User user) {
        if (user.getFirstName() == null || user.getLastName() == null) {
            throw new IllegalArgumentException("First and last name must be provided");
        }
        if (userRepository.findByFirstNameAndLastName(user.getFirstName(), user.getLastName()).isPresent()) {
            throw new UserAlreadyExistsException("User with this name already exists");
        }
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    public User updateUser(Long id, User updateUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setFirstName(updateUser.getFirstName());
                    user.setLastName(updateUser.getLastName());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException("User not found"));
    }
}