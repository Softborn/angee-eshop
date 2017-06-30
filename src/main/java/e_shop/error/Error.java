package e_shop.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Error {

    EMPTY_REQUEST("EMPTY_REQUEST", "Request body cannot be empty!"),
    EMPTY_FIELD("EMPTY_FIELD", "Field must not be empty!");

    @Getter String errorName;
    @Getter String errorMessage;
}
