
// game in java
/* 0 for rock
   1 for paper 
   2 for scissors*/
import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = 1;
        int round, invalid = 0;
        int count = 0, point = 0;
        System.out.println("\t\t\tPOINTS DISTRIBUTION:\nWins\tDraw\tlose\n 2\t\t 1 \t\t 0\n");
        System.out.println(
                "**Important note:\n If you have entered two invalid move then you will lose the game so play accordingly and computer will get points");

        System.out.print("\n\nEnter your choice:\n0 for Rock\n1 for paper\n2 for Scissors\n");
        System.out.print("\nEnter the number of Round you want to play\n");
        round = sc.nextInt();
        while (n <= round) {

            System.out.print("******Round No.:" + n);
            System.out.println("******\n");
            int userinput = sc.nextInt();
            if (userinput > 2) {
                System.out.print("Invalid Input Try again\n");
                invalid++;
            }

            int computerinput = random.nextInt(3);
            System.out.print("Your input:");
            if (userinput == 0)
                System.out.print("Rock\n");
            else if (userinput == 1)
                System.out.print("paper\n");

            else if (userinput == 2)
                System.out.print("Scissors\n");
            System.out.print("Computer input:");
            if (computerinput == 0)
                System.out.print("Rock");
            else if (computerinput == 1)
                System.out.print("paper");

            else if (computerinput == 2)
                System.out.print("Scissors");

            if (userinput == computerinput) {
                System.out.print("\nDraw!\n");
                count++;
                point++;
            }

            else {
                if (userinput == 0 && computerinput == 2 ||
                        userinput == 1 && computerinput == 0 ||
                        userinput == 2 && computerinput == 1) {
                    System.out.print("\nYou win this round\n");
                    count = count + 2;
                }

                else {
                    System.out.print("\nyou lose and Computer win this round\n");
                    point = point + 2;
                }

            }
            n++;

        }
        System.out.println("\nTotal number of round played is " + round);
        System.out.println("\n\n\t\t*****Over all result*****\n");
        System.out.printf("User points:%d \t Computer points: %d\n", count, point);
        if (invalid != 2) {
            if (count > point)
                System.out.println("\nUser wins\n");
            else if (count == point)
                System.out.println("Draw! no one wins");
            else
                System.out.print("\nComputer wins\n");
        }

        else
            System.out.println("Computer wins by fair means(As you have enter two invalids)");
    }
}