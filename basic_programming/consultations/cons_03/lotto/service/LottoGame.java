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

       public void startGame(){


        int playersNumber = ui.uiInt("Введите количество игроков:");
        players = new Player[playersNumber];
           for (int i = 0; i < playersNumber; i++) {
               String playerNickName = ui.uiText("Введите nickname для игрока:");
               Cart cart1 = cartRepository.getCarts()[i * 3 + 0]; // нумерация элементов этого массива 0,1,2,3,4....14
               Cart cart2 = cartRepository.getCarts()[i * 3 + 1];;
               Cart cart3 = cartRepository.getCarts()[i * 3 + 2];;

               players[i] = new Player(playerNickName,cart1, cart2,cart3);

               System.out.println(players[i]);
           }

           boolean noWinner = true;
           int drumCounter = 0;

           while (noWinner) {
               /*
               1) вытащить очередное число из барабана;
               2) у каждого игрока проверить все его карточки и если это число присутствует, то это отметить;
               3) проверить выиграли ли карточка и если да, то вернуть имя информацию об одном из победителей;
               4) проверив всех игроков и если есть победители, то вывести их.
                */

               int currentNumber = drum[drumCounter];

               System.out.print(currentNumber + ", ");

               for (int i = 0; i < players.length; i++) {

                   if (players[i].checkPlayersCarts(currentNumber)) {
                       System.out.println("\n  На " + drumCounter + " ходу, ");
                       System.out.println("\n Игрок " + players[i].getNickname() + " выиграл!!! НАШИ ПОЗДРАВЛЕНИЯ");
                       System.out.println("Выиграла карточка: ");
                       for (int j = 0; j < players[i].getCarts().length; j++) {
                           if (players[i].getCartsMatchesCount()[j] == players[i].getCarts()[j].getCartArray().length) {
                               System.out.println("Выиграла карточка: " + Arrays.toString(players[i].getCarts()[j].getCartArray()));
                           }
                       }

                       noWinner = false;
                   }
               }

               drumCounter++;
           }

       }

}
