package ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class wordFrequencyTest {
    @Test
    void findBiggestNumber() {
        frequencyFinder test = new frequencyFinder();
        ArrayList<Integer> test_array = new ArrayList<>();
        test_array.add(5);
        test_array.add(3);
        test_array.add(7);
        test_array.add(2);
        test_array.add(8);
        test_array.add(2);
        assertEquals(4, test.findBiggestNumber(test_array));
    }
}