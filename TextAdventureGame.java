 import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName;

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println("You find yourself in a dark forest. You can go left (L) or right (R).");

        while (true) {
            System.out.print("Choose your path (L/R/Q to quit): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("L")) {
                System.out.println("You venture deeper into the forest.");
                // Add more story and choices here
            } else if (choice.equalsIgnoreCase("R")) {
                System.out.println("You head right and encounter a river.");
                System.out.print("Do you want to swim (S) or build a raft (B)? ");
                String riverChoice = scanner.nextLine();

                if (riverChoice.equalsIgnoreCase("S")) {
                    System.out.println("You start to swim but get tired and drown. Game over!");
                    break;
                } else if (riverChoice.equalsIgnoreCase("B")) {
                    System.out.println("You build a raft and successfully cross the river. You continue your adventure.");
                    // Add more story and choices here
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            } else if (choice.equalsIgnoreCase("Q")) {
                System.out.println("Thank you for playing, " + playerName + "!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
 
    

