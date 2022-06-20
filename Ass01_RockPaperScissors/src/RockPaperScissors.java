import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)
    {
        String playerA = "";
        String playerB = "";
        String again;
        boolean playAgain = false;
        boolean invalid;


        Scanner in = new Scanner(System.in);

        do {
            do {
                System.out.println("Player A's turn [R,P,S}: ");
                playerA = in.nextLine();

                if (playerA.equalsIgnoreCase("R")) {
                    invalid = false;
                } else if (playerA.equalsIgnoreCase("P")) {
                    invalid = false;
                } else if (playerA.equalsIgnoreCase("S")) {
                    invalid = false;
                } else {
                    invalid = true;
                }
            } while (invalid);

            do {
                System.out.println("Player B's turn [R,P,S}: ");
                playerB = in.nextLine();

                if (playerB.equalsIgnoreCase("R")) {
                    invalid = false;
                } else if (playerB.equalsIgnoreCase("P")) {
                    invalid = false;
                } else if (playerB.equalsIgnoreCase("S")) {
                    invalid = false;
                } else {
                    invalid = true;
                }
            } while (invalid);

            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("It's a tie");
            } else if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers rock, player B wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks scissors, player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers rock, player A wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts paper, player B wins!");
                }
            } else if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks scissors, player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts paper, player A wins!");
                }
            }

            do {
                System.out.println("Do you want to play again? [Y/N]");
                again = in.nextLine();

                if (again.equalsIgnoreCase("Y")) {
                    invalid = false;
                } else if (again.equalsIgnoreCase("N")) {
                    invalid = false;
                } else {
                    invalid = true;
                }
            } while (invalid);

            if (again.equalsIgnoreCase("Y")) {
                playAgain = true;
            }
            else if (again.equalsIgnoreCase("N"))
            {
                playAgain = false;
            }

        }while (playAgain);
    }
}
