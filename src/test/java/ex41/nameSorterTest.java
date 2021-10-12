package ex41;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class nameSortingTest {

    @Test
    void sortNamesList() {
        nameSorter test = new nameSorter();

        ArrayList<String> testNamesList = new ArrayList<>();
        testNamesList.add("Swift, Geoffrey");
        testNamesList.add("Jones, Chris");
        testNamesList.add("Jones, Aaron");
        test.sortNamesList(testNamesList);

        ArrayList<String> sortedTestNamesList = new ArrayList<>();
        sortedTestNamesList.add("Jones, Aaron");
        sortedTestNamesList.add("Jones, Chris");
        sortedTestNamesList.add("Swift, Geoffrey");

        assertEquals(sortedTestNamesList, testNamesList);
    }
}