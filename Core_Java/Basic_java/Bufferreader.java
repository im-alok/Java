import java.io.*;;

public class Bufferreader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("e:/Java/Basic_java/Bufferwriter.txt");
        BufferedReader br = new BufferedReader(fr);
        int ch;
        while ((ch = br.read()) != -1) {
            System.out.print((char) ch);
        }
        br.close();
    }
}
