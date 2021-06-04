package pkg6_3_2021_directory_reader;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Nathanael
 */
public class DirectoryReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String path = "";
        File dir;
        System.out.print("Plese give a directory to read: ");
        path = s.next();
        dir = new File(path);
        File arr[] = dir.listFiles();
        System.out.println("Given directory: " + path);
        System.out.println("Directory contents:");
        for (File arr1 : arr) {
            if (arr1.isFile()) {
                System.out.println("File-> " + arr1.getName());
            }
            if (arr1.isDirectory()) {
                System.out.println("Directory-> " + arr1.getName());
                File subDir[] = arr1.listFiles();
                for (File arr2 : subDir) {
                    if (arr2.isFile()) {
                        System.out.println("    SubFile-> " + arr2.getName());
                    }
                    if (arr2.isDirectory()) {
                        System.out.println("    SubDirectory-> " + arr1.getName());
                    }
                }
            }
        }

    }

}
