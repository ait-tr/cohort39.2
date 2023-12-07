package lotto.entity;

import java.util.Arrays;

public class Player {
    private String nickname;
    private Cart[] carts;

    public Player(String nickname, Cart cart1, Cart cart2, Cart cart3) {
        this.nickname = nickname;
        carts = new Cart[3];
        carts[0] = cart1;
        carts[1] = cart2;
        carts[2] = cart3;
    }

    public String getNickname() {
        return nickname;
    }

    public Cart[] getCarts() {
        return carts;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", carts=" + Arrays.toString(carts) +
                '}';
    }
}
