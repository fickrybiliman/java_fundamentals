package labs_examples.objects_classes_methods.labs.oop.blackjack;

import java.util.Scanner;

public class CardPlayer {
    private String name;
    private int stackValue;

    public CardPlayer() {
        initializeNewUser();
    }

    public CardPlayer(String name, int stackValue) {
        this.name = name;
        this.stackValue = stackValue;
    }

    private void initializeNewUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, and welcome to BlackJack! My naname is computer, what is you name?");
        this.name = scanner.next();

        System.out.println("Thanks " + this.name + "! How much money would you like to start with?");
        this.stackValue = scanner.nextInt();
    }
}
