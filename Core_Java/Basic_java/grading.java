import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = input.nextInt();
        if (marks > 90)
            System.out.println("EXCELLENT");
        else if (marks > 80 && marks <= 90)
            System.out.println("GOOD");
        else if (marks > 70 && marks <= 80)
            System.out.println("fair");
        else if (marks > 60 && marks <= 70)
            System.out.println("meets expectations");
        else
            System.out.println("Not Good");

    }
}
