import java.io.*;

public class Filereading {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("e:/Java/Basic_java/filewriting.txt");
        int i;
        do {
            i = fin.read();
            if (i != -1) {
                System.out.print((char) i);

            }
        } while (i != -1);
        fin.close();
    }
}
