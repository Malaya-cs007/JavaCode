/*
 * By: Malaya Coley-Sturgis
 */



import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner input = new Scanner(System.in);
	        Random rand = new Random();
	        String[] choices = {"Rock", "Paper", "Scissors"};

	        System.out.println("Welcome to Rock Paper Scissors! Best 2 out of 3!");

	        boolean playAgain = true;
	        while (playAgain) {
	            int playerScore = 0;
	            int computerScore = 0;
	            int rounds = 0;

	            while (rounds < 3) {
	                System.out.print("Enter \"Rock\", \"Paper\", or \"Scissors\": ");
	                String playerChoice = input.nextLine();
	                String computerChoice = choices[rand.nextInt(3)];

	                System.out.println(playerChoice + " v " + computerChoice + "!");

	                if (isValidChoice(playerChoice)) {
	                    int result = determineWinner(playerChoice, computerChoice);
	                    if (result == 1) {
	                        System.out.println("Player Wins!");
	                        playerScore++;
	                    } else if (result == -1) {
	                        System.out.println("Computer Wins!");
	                        computerScore++;
	                    } else {
	                        System.out.println("Tie!");
	                    }
	                } else {
	                    System.out.println("Not a valid input! Computer wins");
	                    computerScore++;
	                }

	                System.out.println("Player has won " + playerScore + " times and the computer has won " + computerScore + " times");
	                rounds++;
	            }

	            if (playerScore > computerScore) {
	                System.out.println("The Player wins!");
	            } else if (computerScore > playerScore) {
	                System.out.println("The Computer Wins!");
	            } else {
	                System.out.println("It's a Tie!");
	            }

	            System.out.print("Play again? \"Yes\" or \"No\": ");
	            String response = input.nextLine();
	            playAgain = response.equalsIgnoreCase("Yes");
	        }

	        System.out.println("Goodbye!");
	        input.close();
	    }

	    // Check if input is valid
	    public static boolean isValidChoice(String choice) {
	        return choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors");
	    }

	    // Determine winner: 1 = player wins, -1 = computer wins, 0 = tie
	    public static int determineWinner(String player, String computer) {
	        player = player.toLowerCase();
	        computer = computer.toLowerCase();

	        if (player.equals(computer)) return 0;
	        if ((player.equals("rock") && computer.equals("scissors")) ||
	            (player.equals("paper") && computer.equals("rock")) ||
	            (player.equals("scissors") && computer.equals("paper"))) {
	            return 1;
	        } else {
	            return -1;
	        }

	}

}
