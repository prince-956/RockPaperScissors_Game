import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age<=0) {
            System.out.println("Age must be a positive integer.");
            System.out.println("\nGame ended.");
            return;
        }
        else {
            int userChoice = 0;
            int userScore = 0;
            int computerScore = 0;
            int computerChoice = 0;

            System.out.println("\nAvailable choices:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. End Game");
            System.out.println("\nWinner based on the game's rules:\nRock beats Scissors, Paper beatsRock, and prince" +
                    "Scissors beats Paper");

            do {
                System.out.print("\nEnter your choice (1-4): ");
                userChoice = sc.nextInt();

                if (userChoice>4 || userChoice<1) {
                    System.out.println("Invalid choice.Please enter 1,2, or 3.");
                    System.out.println("\nGame ended.\n");
                    return;
                }
                else {
                    computerChoice = ((int) (Math.random() * 3)) + 1;

                    switch (userChoice) {
                        case 1:
                            System.out.println("You chose : Rock");
                            break;
                        case 2:
                            System.out.println("You chose : Paper");
                            break;
                        case 3:
                            System.out.println("You chose : Scissors");
                            break;
                        case 4:
                            System.out.println("Game ended.");
                            break;
                    }

                    if (userChoice!=4) {
                        if (computerChoice == 1) {
                            System.out.println("Computer chose : Rock");
                        } else if (computerChoice == 2) {
                            System.out.println("Computer chose : Paper");
                        } else if (computerChoice == 3) {
                            System.out.println("Computer chose : Scissors");
                        }
                    }

                    if (userChoice == computerChoice) {
                        System.out.println("\nIt's a tie!");
                    }
                    else if (userChoice == 1 && computerChoice == 3) {
                        userScore++;
                    }
                    else if (userChoice == 2 && computerChoice == 1) {
                        userScore++;
                    }
                    else if (userChoice == 3 && computerChoice == 2) {
                        userScore++;
                    }
                    else if (userChoice == 3 && computerChoice == 1) {
                        computerScore++;
                    }
                    else if (userChoice == 1 && computerChoice == 2) {
                        computerScore++;
                    }
                    else if (userChoice == 2 && computerChoice == 3) {
                        computerScore++;
                    }
                }
            } while (userChoice!=4);

            System.out.println("\nFinal Score - [" + name + "] : [" + userScore + "]");
            System.out.println("Final Score - " + "[Computer] : [" + computerScore + "]");


            if(userScore == computerScore){
                System.out.println("\nIt's a tie game!");
            }
            else if (userScore > computerScore) {
                System.out.println("\n" + name + " wins the game!");
            }
            else {
                System.out.println("\nComputer wins the game!");
            }
        }
    }
}
