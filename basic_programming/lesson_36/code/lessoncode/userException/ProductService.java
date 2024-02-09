package userException;

public class ProductService {

    ValidationServiceWithException validationService;

    public ProductService(ValidationServiceWithException validationService) {
        this.validationService = validationService;
    }

    public void add(Product product){
        validationService.validate(product);

        System.out.println("Success add new product");


    }

}
