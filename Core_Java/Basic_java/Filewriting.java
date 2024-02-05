import java.io.*;
import java.util.*;

public class Filewriting {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        File ob = new File("e:/Java/Basic_java/filewriting.txt");
        ob.createNewFile();
        int i = 0;
        char[] string = s.toCharArray();
        FileOutputStream fout = new FileOutputStream(ob, false);
        for (i = 0; i < string.length; i++)
            fout.write(string[i]);
        fout.close();

    }

}
