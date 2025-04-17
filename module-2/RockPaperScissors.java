import java.util.Random;
import java.util.Scanner;



public class RockPaperScissors {
    public static void main(String[] args) {
      

        Random random = new Random();
        int computerDecision = random.nextInt(3) + 1;

      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1(Rock), 2(Paper), 3(Scissors):");
        int userDecision = scanner.nextInt();

       
        System.out.println("Computer: " + choiceToString(computerDecision));
        System.out.println("User: " + choiceToString(userDecision));

    
        determineWinner(computerDecision, userDecision);
    }

 
    private static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }

  
    private static void determineWinner(int computerDecision, int userDecision) {
        if (computerDecision == userDecision) {
            System.out.println("It's a tie!");
        } else if ((computerDecision == 1 && userDecision == 3) ||
                   (computerDecision == 2 && userDecision == 1) ||
                   (computerDecision == 3 && userDecision == 2)) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("You win!");
        }
    }
}