package game;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetWins = 0;
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;
        int round = 1;

        while (true) {
            System.out.print("Enter the number of wins needed to win the game: ");

            if (scanner.hasNextInt()) {
                targetWins = scanner.nextInt();

                if (targetWins > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Please enter a positive integer greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
        }

        while (playerWins < targetWins && computerWins < targetWins) {
            System.out.println("\nRound " + round);
            System.out.print("Press Enter to roll your dice...");
            scanner.nextLine();

            int playerRoll = random.nextInt(6) + 1;
            int computerRoll = random.nextInt(6) + 1;

            System.out.println("You rolled: " + playerRoll);
            System.out.println("Computer rolled: " + computerRoll);

            if (playerRoll > computerRoll) {
                playerWins++;
                System.out.println("You won this round!");
            } else if (playerRoll < computerRoll) {
                computerWins++;
                System.out.println("You lost this round!");
            } else {
                draws++;
                System.out.println("This round is a draw!");
            }

            round++;
        }

        System.out.println("\nGame Over!");

        if (playerWins == targetWins) {
            System.out.println("You are the overall winner!");
            System.out.println("Wins: " + playerWins);
            System.out.println("Draws: " + draws);
            System.out.println("Losses: " + computerWins);
        } else {
            System.out.println("Computer is the overall winner!");
            System.out.println("Wins: " + computerWins);
            System.out.println("Draws: " + draws);
            System.out.println("Losses: " + playerWins);
        }

        scanner.close();
    }
}