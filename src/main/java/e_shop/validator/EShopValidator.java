package e_shop.validator;

import e_shop.error.Error;
import e_shop.error.ValidationException;
import e_shop.model.Watch;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Component;

import static org.apache.commons.lang3.StringUtils.isEmpty;

@Component
public class EShopValidator {

    public void validateWatch(Watch watch) {
//        if (!ObjectUtils.allNotNull(watch)) {
//            throw new ValidationException(Error.EMPTY_REQUEST);
//        } else {
//            if (isEmpty(watch.getTitle())) {
//                throw new ValidationException(Error.EMPTY_FIELD, "title");
//            }
//
//            if (isEmpty(watch.getDescription())) {
//                throw new ValidationException(Error.EMPTY_FIELD, "description");
//            }
//
//            if (watch.getPrice() == null) {
//                throw new ValidationException(Error.EMPTY_FIELD, "price");
//            }
//
//            if (isEmpty(watch.getFountain())) {
//                throw new ValidationException(Error.EMPTY_FIELD, "fountain");
//            }
//        }

        if (isEmpty(watch.getTitle())) {
            throw new ValidationException(Error.EMPTY_FIELD, "title");
        }

        if (isEmpty(watch.getDescription())) {
            throw new ValidationException(Error.EMPTY_FIELD, "description");
        }

        if (watch.getPrice() == null) {
            throw new ValidationException(Error.EMPTY_FIELD, "price");
        }

        if (isEmpty(watch.getFountain())) {
            throw new ValidationException(Error.EMPTY_FIELD, "fountain");
        }
    }

}
