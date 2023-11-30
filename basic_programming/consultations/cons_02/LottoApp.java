import entity.Cart;
import repository.CartRepository;
import service.CartServices;

import java.util.Arrays;

public class LottoApp {
    public static void main(String[] args) {
        CartServices cartServices = new CartServices();
        CartRepository cartRepository = new CartRepository(5);

        System.out.println(Arrays.toString(cartRepository.getCarts()));

        Cart[] carts = cartRepository.getCarts();

        for (int i = 0; i < carts.length; i++) {
            carts[i] = new Cart(15);
            cartServices.fillNewCard(carts[i], 90);
            System.out.println(Arrays.toString(carts[i].getCartArray()));
        }

        //System.out.println(Arrays.toString(cartRepository.getCarts()));

    }
}
