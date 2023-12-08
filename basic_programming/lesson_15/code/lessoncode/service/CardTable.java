package service;

import entity.Cards;
import entity.Player;
import service.utils.CardTableUtil;
import service.utils.DeckService;
import service.utils.InputData;
import service.utils.PrintServices;

public class CardTable {
   Cards cards = new Cards();

   DeckService deckService = new DeckService();
   CardTableUtil cardTableUtil= new CardTableUtil();
   PrintServices printServices = new PrintServices();

    InputData iData = new InputData();
    public int numberOfPayers = iData.enterNumberOfPlayers();
    public Player[] players = new Player[numberOfPayers];

    int numberCardsForEachPlayer = 5;

public void game(){

    deckService.fillDeck(cards.getDeck());
    printServices.printDeck(cards.getDeck(), "----------- Create New Deck -----------");

    cards.setDeckShuffle(deckService.deckShuffle(cards.getDeck()));

    printServices.printDeck(cards.getDeckShuffle(), "--------- Deck after shuffle --------");

    cardTableUtil.createPlayers(players);
    cardTableUtil.dealCards(cards.getDeckShuffle(), numberCardsForEachPlayer, numberOfPayers, players);
    printServices.printPlayers(players);



}


}
