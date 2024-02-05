import java.util.*;

public class index_of_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of number you want to enter:");
        int number = input.nextInt();
        int i, index = 0;
        int[] array = new int[number];
        // ASSIGNING NUMBER TO THE ARRAY

        for (i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Enter the number of which you wanr index:");
        int num = input.nextInt();

        for (i = 0; i < array.length; i++)

        {
            if (num == array[i])

            {
                System.out.println(index);
                break;
            } else
                index++;

        }
        if (index == array.length)
            System.out.println("-1");
    }

}
