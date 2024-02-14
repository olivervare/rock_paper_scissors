import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int computerScore = 0;
        int result = 0;

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;
        
            while (true) {
                System.out.println("Please enter your move: r, p or s");
                playerMove = scanner.nextLine();            
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move!");
            }
    
            System.out.println("Computer played: " + computerMove);
    
            if (playerMove.equals(computerMove)) {
                result = 0;
            }
            else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    result = 2;
                } else if (computerMove.equals("s")) {
                    result = 1;
                }
            }
            else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    result = 2;
                } else if (computerMove.equals("r")) {
                    result = 1;
                }
            }
            else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    result = 2;
                } else if (computerMove.equals("p")) {
                    result = 1;
                }
            }

            if (result == 0) {
                System.out.println("The game was a tie");
                playerScore++;
                computerScore++;
            } else if (result == 1) {
                System.out.println("You won.");
                    playerScore += 3;
            } else if (result == 2) {
                System.out.println("You lost.");
                computerScore += 3;
            }
        
            System.out.println("You vs computer: " + playerScore + " - " + computerScore);
            System.out.println("Play again? y/n");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) {
                System.out.println("Game over.");
                break;
            }
        }
        scanner.close();
    }
}
