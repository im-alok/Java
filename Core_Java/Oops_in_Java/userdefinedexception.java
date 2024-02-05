import java.util.*;

class YoungClassException extends RuntimeException {
    YoungClassException(String mssg) {
        super(mssg);
    }
}

public class userdefinedexception {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18) {

            throw new YoungClassException("You are not Eligile to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

}
