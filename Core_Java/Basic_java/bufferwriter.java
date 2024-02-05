import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class bufferwriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("e:/Java/Basic_java/Bufferwriter.txt");
        BufferedWriter bf = new BufferedWriter(fw);
        String s = "Hii,My name is Alok Ranjan";
        bf.write(s);
        bf.close();
    }
}
