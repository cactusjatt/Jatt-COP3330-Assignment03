/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex41;
import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class nameSorter {

    public static ArrayList<String> readFileInformation()  throws Exception {

        File inputFile = new File("C:\\Users\\sarim\\IdeaProjects\\Jatt-COP3330-Assignment03\\src\\main\\java\\ex41\\exercise41_input.txt");
        Scanner scan = new Scanner(inputFile);

        ArrayList<String> namesList = new ArrayList<>();

        while(scan.hasNextLine()) {
            namesList.add(scan.nextLine());
        }
        return namesList;
    }

    public static void sortNamesList(ArrayList<String> namesList) {
        String temp;
        for(int i = 0; i < namesList.size(); i++) {
            for(int j = i; j < namesList.size(); j++) {
                for(int k = 0; k < namesList.get(j).length(); k++) {
                    if(namesList.get(j).charAt(k) < namesList.get(i).charAt(k)) {
                        temp = namesList.get(i);
                        namesList.set(i, namesList.get(j));
                        namesList.set(j, temp);
                        break;
                    }
                    else if(namesList.get(j).charAt(k) > namesList.get(i).charAt(k)) break;
                }
            }
        }
    }

    public static void printNamesList(ArrayList<String> namesList) throws Exception {
        PrintStream output = new PrintStream(("C:\\Users\\sarim\\IdeaProjects\\Jatt-COP3330-Assignment03\\src\\main\\java\\ex41\\exercise41_output.txt"));
        System.setOut(output);

        System.out.println("Total of " + namesList.size() + " names");
        System.out.println("-----------------");
        for(String s: namesList) System.out.println(s);
    }

    public static void main( String[] args )  throws Exception
    {
        ArrayList<String> namesList = readFileInformation();
        sortNamesList(namesList);
        printNamesList(namesList);
    }
}