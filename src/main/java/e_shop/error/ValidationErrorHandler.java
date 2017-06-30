package e_shop.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ValidationErrorHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ValidationError> handleException(ValidationException ex){
        HttpStatus status = handleHttpStatus(ex.getValidationError().getError());
        return new ResponseEntity<> (ex.getValidationError(), status);
    }

    private HttpStatus handleHttpStatus(Error error) {
        switch (error) {
            case EMPTY_REQUEST:
            case EMPTY_FIELD:
                return HttpStatus.BAD_REQUEST;
            default:
                return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

}
