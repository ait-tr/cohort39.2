package userException;

public class ProductService {

    ValidationService validationService;

    public ProductService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public void add(Product product){
        String validationResult = validationService.validate(product);
        if (validationResult.equals("OK")) {
        System.out.println("Success add new product");
        } else {
            System.out.println(validationResult);
        }

    }

}
