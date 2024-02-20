import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playerA;
        String playerB;
        String answer;
        boolean done = false;

        do{
            // Getting move from player A
            System.out.print("Player A, enter your move [R/P/S]: ");
            do {
                playerA = in.nextLine();
                if(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.print("The input " + playerA + " is not a valid input. Try again. [R/P/S]: ");
                }
            } while(!done);
            done = false;

            // Getting move from player B
            System.out.print("Player B, enter your move [R/P/S]: ");
            do {
                playerB = in.nextLine();
                if(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.print("The input " + playerB + " is not a valid input. Try again. [R/P/S]: ");
                }
            } while(!done);
            done = false;

            if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) {    // Rock vs Paper
                System.out.println("Paper covers Rock! Player B wins!");
            }
            else if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {   // Rock vs Scissors
                System.out.println("Rock breaks Scissors! Player A wins!");
            }
            else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {   // Paper vs Rock
                System.out.println("Paper covers Rock! Player A wins!");
            }
            else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")) {   // Paper vs Scissors
                System.out.println("Scissors cut Paper! Player B wins!");
            }
            else if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R")) {   // Scissors vs Rock
                System.out.println("Rock breaks Scissors! Player B wins!");
            }
            else if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {   // Scissors vs Paper
                System.out.println("Scissors cut Paper! Player A wins!");
            }
            else if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("R")) {   // Draw
                System.out.println("Rock vs Rock! It's a tie!");
            }
            else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("P")) {   // Draw
                System.out.println("Paper vs Paper! It's a tie!");
            }
            else {  // Draw
                System.out.println("Scissors vs Scissors! It's a tie!");
            }

            // Playing again
            System.out.print("Would you like to play again? [Y/N]: ");
            answer = in.nextLine();
            if(answer.equalsIgnoreCase("Y")) {
                done = false;
            }
            else {
                System.out.println("Thanks for playing!");
                done = true;
            }
        } while(!done);
    }
}