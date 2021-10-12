/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex42;
import java.io.File;
import java.util.*;

public class parsingData {
    public static ArrayList<String[]> readFileInformation()  throws Exception {
        File inputFile = new File("C:\\Users\\sarim\\IdeaProjects\\Jatt-COP3330-assignment03\\src\\main\\java\\ex42\\exercise42_input.txt");
        Scanner scan = new Scanner(inputFile);

        ArrayList<String[]> namesList = new ArrayList<>();

        while(scan.hasNextLine()) {
            namesList.add(scan.nextLine().split(",", 3));
        }

        return namesList;
    }

    public static void printNamesList(ArrayList<String[]> namesList) {
        // Table Format
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");

        for(String[] temp_array: namesList) {
            for(String temp: temp_array) {
                String formattingString = String.format("%-10s", temp);
                System.out.print(formattingString);
            }
            System.out.println();
        }
    }

    public static void main( String[] args )  throws Exception
    {
        ArrayList<String[]> namesList = readFileInformation();
        printNamesList(namesList);
    }
}