package e_shop.error;

import lombok.Data;

@Data
public class ValidationError {

    private Error error;
    private String message;
    private String scope;

    public ValidationError(Error error){
        this.error = error;
        this.message = error.getErrorMessage();
    }

    public ValidationError(Error error, String scope) {
        this.error = error;
        this.message = error.getErrorMessage();
        this.scope = scope;
    }
}
