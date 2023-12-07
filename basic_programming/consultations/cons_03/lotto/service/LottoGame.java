package lotto.service;

import lotto.entity.Cart;
import lotto.entity.Player;
import lotto.repository.CartRepository;
import lotto.service.CartServices;

import java.util.Arrays;

public class LottoGame {

    int numberInTheEachCart;


    int numberInTheDrum;

    private int[] drum;
    private Player[] players;

    CartServices cartServices = new CartServices();
    CartRepository cartRepository = new CartRepository(15);

    UserInput ui = new UserInput();


    public LottoGame(int numberInTheEachCart, int numberInTheDrum) {
        this.numberInTheEachCart = numberInTheEachCart;
        this.numberInTheDrum = numberInTheDrum;
        prepareGameDrum();
        createCards();
    }


    private void prepareGameDrum() {
        // Создание и заполнение барабана
        drum = new int[numberInTheDrum];
        for (int i = 1; i <= numberInTheDrum; i++) {
            drum[i - 1] = i;
        }

        for (int i = drum.length - 1; i > 1; i--) {
            int j = (int) (Math.random() * i);
            int temp = drum[i];
            drum[i] = drum[j];
            drum[j] = temp;
        }
    }

    private void createCards() {
        Cart[] carts = cartRepository.getCarts();

        for (int i = 0; i < carts.length; i++) {
            carts[i] = new Cart(numberInTheEachCart);
            cartServices.fillNewCard(carts[i], numberInTheDrum);
        }
    }

    public void startGame() {

        int playersNumber = getPlayersNumber();

        inputPlayersDetails(playersNumber);

        boolean noWinner = true;
        int drumCounter = 0;

        while (noWinner) {
            int currentNumber = drum[drumCounter];
            drumCounter++;
            noWinner = isNoWinner(currentNumber);
        }

        printWinners(drumCounter);

        System.out.println("=============================================");

        printAllPayersCarts();

    }


    private void printAllPayersCarts(){
        for (int i = 0; i < players.length; i++) {
            System.out.println();
            System.out.println("Игрок: " + players[i].getNickname());
            for (int j = 0; j < players[i].getCarts().length; j++) {
                System.out.println("Карточка №" + (j + 1));
                System.out.println(Arrays.toString(players[i].getCarts()[j].getCartArray()) + " выпало " + players[i].getCartsMatchesCount()[j] + " номеров.");
            }
        }
    }

    private void printWinners(int drumCounter) {
        System.out.println("\n На " + drumCounter + " ходу СТОП ИГРА!");
        // печать барабана до момента выигрыша
        for (int i = 0; i < drumCounter; i++) {
            System.out.print(drum[i] + ", ");
        }

        System.out.println();

        // печать выигрышных карточек

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].getCartsMatchesCount().length; j++) {
                if (players[i].getCartsMatchesCount()[j] == numberInTheEachCart) {
                    System.out.println("Поздравляем игрока: " + players[i].getNickname());
                    System.out.println("Выигрышная карточка: " + Arrays.toString(players[i].getCarts()[j].getCartArray()));
                }
            }
        }

    }

    private boolean isNoWinner(int currentNumber) {
        boolean noWinner = true;

        for (int i = 0; i < players.length; i++) {
            if (players[i].checkPlayersCarts(currentNumber)) {
                noWinner = false;
            }
        }
        return noWinner;
    }

    private void inputPlayersDetails(int playersNumber) {
        for (int i = 0; i < playersNumber; i++) {
            String playerNickName = ui.uiText("Введите nickname для игрока:");
            Cart cart1 = cartRepository.getCarts()[i * 3 + 0]; // нумерация элементов этого массива 0,1,2,3,4....14
            Cart cart2 = cartRepository.getCarts()[i * 3 + 1];
            Cart cart3 = cartRepository.getCarts()[i * 3 + 2];

            players[i] = new Player(playerNickName, cart1, cart2, cart3);

            System.out.println(players[i]);
        }
    }

    private int getPlayersNumber() {
        int playersNumber = ui.uiInt("Введите количество игроков:");
        players = new Player[playersNumber];
        return playersNumber;
    }

}
