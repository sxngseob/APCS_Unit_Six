import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {

    public static String[] read() throws IOException {
        String[] words = new String[9];
        Scanner scan = new Scanner(new File("files/readfrom.text"));
        int count = 0;
        while (scan.hasNext()) {
            words[count] = scan.next();
            count++;
        }

        return words;
    }

    public static void write(String[] arr) throws IOException{
        FileWriter fw = new FileWriter("files/writeto.txt");
        for (String word : arr) {
            fw.write(word);
        }
        fw.close();
    }

    public static void main(String[] args) throws IOException {

        String[] arr = read();
        write(arr);

    }

}




