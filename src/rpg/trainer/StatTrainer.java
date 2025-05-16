package rpg.trainer;

import java.util.Scanner;

public class StatTrainer {
    private final Hero hero;

    public StatTrainer(Hero hero) {
        this.hero = hero;
    }

    public void printMenu() {
        System.out.println("\nWelcome to Stat Trainer!");
        System.out.println("What would you like to do?");
        System.out.println("- train strength");
        System.out.println("- train intelligence");
        System.out.println("- train agility");
        System.out.println("- view stats");
        System.out.println("- quit");
        System.out.print("> ");
    }

    public void start() {
        String choice = "";

        try (Scanner scanner = new Scanner(System.in)) {
            while (!choice.equals("quit")) {
                printMenu();
                choice = scanner.nextLine().toLowerCase();

                switch (choice) {
                    case "train strength" -> hero.trainStr();
                    case "train intelligence" -> hero.trainIntel();
                    case "train agility" -> hero.trainAgi();
                    case "view stats" -> System.out.println(hero.viewStats());
                    case "quit" -> System.out.println("Exiting Stat Trainer.");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
