
package pkg6_3_2021_append_text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 *
 * @author Nathanael
 */
public class TextAppender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String path = "";//accepts input for custom user files
        String appendment = "";//stores user text for appending
        System.out.print("Please give the file path of what you're appending: ");//Custom input
        path = s.nextLine();
        System.out.print("Write the appended text here: ");//Self-explainatory
        appendment = s.nextLine();
        try {
            Files.write(Paths.get(path), appendment.getBytes(), StandardOpenOption.APPEND);//Very quick and easy, one line answer. Much easier than FileWriter, BufferedWriter, etc. 
        } catch (IOException e) {
            System.out.println("Error loading given file path");
        }
        System.out.println("Your document should now be appended.");
    }

}
