package com.tu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class StreamsTutorialsTest {


    @Test
    public void testFilterEvenNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        StreamsTutorials streamsTutorials = new StreamsTutorials();
        List<Integer> evenNumbers = streamsTutorials.filterEvenNumbers(numbers);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);

        assertIterableEquals(expected, evenNumbers);

    }
}