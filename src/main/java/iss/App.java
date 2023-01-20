package iss;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        String[] choice = { "scissor", "paper", "stone" };
        Integer computerChoice, playerChoice;
        String winner = "";

        Scanner scanner = new Scanner(System.in);
        SCP scp = new SCP();
        computerChoice = scp.generateComputerChoice();

        while (winner.equals("")) {
            System.out.println("Enter (1)Scissor, (2)Paper, or (3)Stone: ");
            playerChoice = scanner.nextInt();

            if (playerChoice >= 1 && (playerChoice <= 3)) {

            } else {
                System.out.println("Invalid input: Only number 1, 2 or 3 is allowed.");
                continue;
            }

            winner = scp.checkWinner(playerChoice, computerChoice);
            if (winner.equalsIgnoreCase("")) {
                System.out.println("It is a tie.");
            } else {
                System.out.println("winner is: " + winner);
            }
        }

        scanner.close();
    }

}
