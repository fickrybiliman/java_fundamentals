package labs_examples.objects_classes_methods.labs.oop.blackjack;

import labs_examples.objects_classes_methods.labs.oop.blackjack.object_models.CardPlayer;
import labs_examples.objects_classes_methods.labs.oop.blackjack.object_models.Game;
import labs_examples.objects_classes_methods.labs.oop.blackjack.object_models.Deck;

public class BlackJackGame extends Game implements CardGame {

    public void play() {

        setName("Black Jack");
        setBasicRules("The player closest to 21 without going over wins");

        CardPlayer computer = new CardPlayer("Computer", 100_000);
        CardPlayer user = new CardPlayer();

        Deck deck;

        do {

            deck = new Deck();

            System.out.println("\nGame #" + Deck.getFreshDecksLoaded());

            printAsciiArt();

        } while (true);
    }

    private void printAsciiArt() {
        System.out.println("\n----------------------------------------");
        System.out.println("     Let's play some BlackJack!");
        System.out.println("                              _");
        System.out.println("    ,'`.    _  _     /\\     _(_)_");
        System.out.println("   (_,._)  ( `' )  <    >  (_)+(_)");
        System.out.println("     /\\     `.,'     \\/      |||  ");
        System.out.println("----------------------------------------");
        System.out.println();
    }
}
