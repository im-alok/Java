import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        File ob = new File("e:/Java/Basic_java/name1.txt");
        ob.createNewFile();
        System.out.println("Is File exist or not:" + ob.exists());
        System.out.println("is it is writable or not:" + ob.canWrite());
        System.out.println("Name of file:" + ob.getName());
        System.out.println("Size of File:" + ob.length());
        // ob.delete();
    }

}