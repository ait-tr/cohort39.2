package lotto.service;

import lotto.entity.Cart;
import lotto.entity.Player;
import lotto.repository.CartRepository;
import lotto.service.CartServices;

import java.util.Arrays;

public class LottoGame {

    private int[] drum;
    private Player[] players;

    CartServices cartServices = new CartServices();
    CartRepository cartRepository = new CartRepository(15);

    UserInput ui = new UserInput();


    public LottoGame() {
        prepareGameDrum();
        createCards();
    }

    private void prepareGameDrum(){
        // Создание и заполнение барабана
        drum = new int[90];
        for (int i = 1; i <= 90 ; i++) {
            drum[i - 1] = i;
        }

        for (int i = drum.length - 1; i > 1 ; i--) {
            int j = (int) (Math.random() * i);
            int temp = drum[i];
            drum[i] = drum[j];
            drum[j] = temp;
        }
       }

       private void createCards(){
           Cart[] carts = cartRepository.getCarts();

           for (int i = 0; i < carts.length; i++) {
               carts[i] = new Cart(15);
               cartServices.fillNewCard(carts[i], 90);
           }
       }

       public void game(){
        int playersNumber = ui.uiInt("Введите количество игроков:");
        players = new Player[playersNumber];
           for (int i = 0; i < playersNumber; i++) {
               String playerNickName = ui.uiText("Введите nickname для игрока:");
               Cart cart1 = cartRepository.getCarts()[i * 3 + 0]; // нумерация элементов этого массива 0,1,2,3,4....14
               Cart cart2 = cartRepository.getCarts()[i * 3 + 1];;
               Cart cart3 = cartRepository.getCarts()[i * 3 + 2];;

               players[i] = new Player(playerNickName,cart1, cart2,cart3);
           }
       }

}
