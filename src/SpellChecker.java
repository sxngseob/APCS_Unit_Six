import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpellChecker {

    public static String[] getDictionary() throws IOException {

        String[] words = new String[61336];
        Scanner scan = new Scanner(new File("files/words.txt"));
        int count = 0;
        while (scan.hasNext()) {
            words[count] = scan.next();
            count++;
        }

        return words;
    }

    public static int wordInDictionary(String word, String[] dictionary) {
        int num;
        int min = 0;
        while (min <= dictionary.length) {
            int max = dictionary.length;
            int midNum = (max + min) / 2;
            if (dictionary[midNum].compareToIgnoreCase(word) == 0) {
                num = 0;
                return num;
            } else if (dictionary[midNum].compareToIgnoreCase(word) < 0) {
                min = midNum + 1;
            } else {
                max = midNum - 1;
            }
        }
        return -1;
    }

    public static void main (String args[]) throws IOException{
        String[] arr = getDictionary();
        Scanner scan = new Scanner(System.in);
        Scanner alice = new Scanner(new File("files/alice.txt"));
        FileWriter correctedAlice = new FileWriter("files/corrected.txt");

        while(alice.hasNext()){
            String word = alice.next();
            if(wordInDictionary(word, arr) == -1){
                System.out.println(word + "is spelled wrong, press y to change and n to remain the same");
                String change = scan.nextLine();
                if(change.equals("y")){
                    System.out.println("Correct word: ");
                }
                if(change.equals("n")){
                    correctedAlice.write(word + " ");
                }

            } else {
                correctedAlice.write(word + " ");
            }
        }
        correctedAlice.close();
    }
}