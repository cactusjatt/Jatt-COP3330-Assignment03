/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex46;
import java.io.File;
import java.util.*;

public class frequencyFinder {
    public static void frequencyArray(ArrayList<String> words, ArrayList<Integer> wordsCount) throws Exception {
        File inputFile = new File(
                "C:\\Users\\sarim\\IdeaProjects\\Jatt-COP3330-assignment03\\src\\main\\java\\ex46\\exercise46_input.txt");
        Scanner scan = new Scanner(inputFile);

        while(scan.hasNextLine()) {
            String[] wordsInLine = scan.nextLine().split(" ");
            for(String word: wordsInLine) {
                boolean seenWord = false;
                for(int i = 0; i < words.size(); i++) {
                    if(word.equals(words.get(i))) {
                        wordsCount.set(i, wordsCount.get(i) + 1);
                        seenWord = true;
                    }
                }
                if(!seenWord) {
                    words.add(word);
                    wordsCount.add(1);
                }
            }
        }
        scan.close();
    }

    public static int findBiggestNumber(ArrayList<Integer> wordsCount) {
        int biggestNumber = 0;
        int biggestNumberLocation = 0;
        for(int j = 0; j < wordsCount.size(); j++) {
            if(biggestNumber < wordsCount.get(j)) {
                biggestNumber = wordsCount.get(j);
                biggestNumberLocation = j;
            }
        }
        return biggestNumberLocation;
    }

    public static void printWordsAndCountInOrder(ArrayList<String> words, ArrayList<Integer> wordsCount) {
        while(words.size() > 0) {
            int biggestNumberLocation = findBiggestNumber(wordsCount);
            System.out.format("%-10s", words.get(biggestNumberLocation) + ": ");
            for(int k = 0; k < wordsCount.get(biggestNumberLocation); k++) System.out.print("*");
            System.out.println();
            words.remove(biggestNumberLocation);
            wordsCount.remove(biggestNumberLocation);
        }
    }

    public static void main( String[] args ) throws Exception {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> wordsCount = new ArrayList<>();
        frequencyArray(words, wordsCount);
        printWordsAndCountInOrder(words, wordsCount);
    }
}