/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex45;
import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class wordFinder {
    public static void replaceAllUtilizeAndPrintToOutput(String outputFileName) throws Exception {
        File inputFile = new File(
                "C:\\Users\\sarim\\IdeaProjects\\Jatt-COP3330-assignment03\\src\\main\\java\\ex45\\exercise45_input.txt");
        Scanner scan = new Scanner(inputFile);

        PrintStream outputFile = new PrintStream(("C:\\Users\\sarim\\IdeaProjects\\Jatt-COP3330-assignment03\\src\\main\\java\\ex45\\" + outputFileName));
        System.setOut(outputFile);

        while(scan.hasNextLine()) {
            String[] wordsInLine = (scan.nextLine().split(" "));
            for(String word: wordsInLine) {
                word = word.replace("utilize", "use");
                System.out.print(word + " ");
            }
            System.out.println();
        }

        scan.close();
    }

    public static void main( String[] args ) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("What would you like to call your output file: ");
        String outputFileName = in.nextLine();
        in.close();

        replaceAllUtilizeAndPrintToOutput(outputFileName);
    }
}