import java.util.*;

public class IIMT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[2];
        int i;
        for (i = 0; i < marks.length; i++)
            marks[i] = input.nextInt();
        for (i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        if(marks[0]<marks[1])
            System.out.println(marks[1]);
        else 
            System.out.println(marks[0]);
        }
    }
}
