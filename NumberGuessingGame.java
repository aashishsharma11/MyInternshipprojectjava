import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner Scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println("Random number is " + randomNumber);
        while(true) {
          System.out.println("Enter your guess (1-100):");
          int playerGuess = Scanner.nextInt();
          if (playerGuess == randomNumber) {
             System.out.println("correct! you win!");
          }   
          else if(randomNumber > playerGuess) {
            System.out.println("ashish! the number is higher.guess again.");
          }
          else {
            System.out.println("ashish! the number is lower.guess again."); 
          }
        }
    }               
}



    
