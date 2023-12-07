package lotto.repository;

import entity.Cart;

public class CartRepository {

    Cart[] carts;

    public CartRepository(int numberOfCart) {
        this.carts = new Cart[numberOfCart];
    }

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }
}
