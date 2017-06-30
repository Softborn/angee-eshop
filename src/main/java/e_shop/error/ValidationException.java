package e_shop.error;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ValidationException extends RuntimeException {

    private ValidationError validationError;

    public ValidationException(Error error) {
        this.validationError = new ValidationError(error);
    }

    public ValidationException(Error error, String scope) {
        this.validationError = new ValidationError(error, scope);
    }

}
