package userException;

import java.util.List;

public class ProductValidationException extends RuntimeException{

    public ProductValidationException(String message) {

        super(message);
    }
}
