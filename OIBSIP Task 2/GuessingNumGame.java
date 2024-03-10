import java.util.Scanner;
import java.lang.Math;

public class GuessingNumGame {
  public static void main(String[] args) {
    boolean playAgain = true;
    Scanner input = new Scanner(System.in);
    while(playAgain) {  
       int answer = (int)(Math.random() * 100) + 1;
       int k = 5;
       boolean correct = false;
       System.out.print("\033[H\033[2J");
       System.out.flush();
       System.out.println("A number is choosen between 1 to 100. \nGuess the number within 5 trials.");
       while (k > 0) {
         System.out.print("Guess the number: ");
         int guess = input.nextInt();
         if (guess == answer) {
            System.out.println("Congratulations!! You have guessed correctly.");
            correct = true;
            break;
         }
         else if (guess > answer) {
           System.out.println("The number is less than " + guess +"\nWrong guess, you have " + (k - 1) + " chances left.");
           k--;
         }
         else if (guess < answer) {
           System.out.println("The number is greater than " + guess + "\nWrong guess, you have " + (k - 1) + " chances left.");
           k--;
         }
       }
       if (correct == false) {
         System.out.println("The number was " + answer);
         System.out.println("Play again ...");
       }
       System.out.print("Do you want to play again? (yes/no): ");
       String playAgainChoice = input.next();
       if (!playAgainChoice.equalsIgnoreCase("yes")) {
            playAgain = false;
            System.out.println("Thanks for playing!");
        }
    }
    input.close();
  }
}