package exception;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ApiError {
    private int errorCode;
    private String errorMessage;
}
