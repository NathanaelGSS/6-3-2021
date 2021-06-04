package pkg6_3_2021_repetition_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nathanael
 */
public class RepetitionReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String path = "";//accepts input for custom user files/directories
        char c;//stores user text for counting
        int count = 0;//exactly what it sounds like
        System.out.print("Please give the file path of what you're reading: ");//Custom input
        path = s.nextLine();
        System.out.print("What character are we counting today?: ");//Self-explainatory
        c = s.next().charAt(0);//ensures we only get a single char
        try {
            BufferedReader r = new BufferedReader(new FileReader(path));
            try {
                while (r.read() != -1) {//read to the very end
                    String line = r.readLine();//storing lines in a String to break it down into chars
                    char ch[] = new char[line.length()];//store chars in an array to count through them later
                    for (int i = 0; i < line.length(); i++) {
                        ch[i] = line.charAt(i);//storing
                    }
                    for (int i = 0; i < ch.length; i++) {
                        if (ch[i] == c) {
                            count++;
                        }
                    }
                }
                System.out.println("Total count: " + count);
            } catch (IOException ex) {
                System.out.println("Read error!!!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file!");
        }
    }

}
