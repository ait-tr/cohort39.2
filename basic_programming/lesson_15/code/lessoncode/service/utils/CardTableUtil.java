package service.utils;

import entity.Card;
import entity.Player;

import java.util.Arrays;

public class CardTableUtil {

    public void createPlayers(Player[] players){
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Players # " + (i+1));
        }
    }


    public void dealCards(Card[] deck, int numberCardsForEachPlayers, int numberOfPayers, Player[] players){
        int counter = 0 ;
        for (int i = 0; i < numberCardsForEachPlayers; i++) {
            for (int j = 0; j < numberOfPayers; j++) {
                players[j].getPlayerCards()[i] = deck[counter];
                counter++;
            }

        }
    }


}
