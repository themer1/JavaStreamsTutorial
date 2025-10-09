package com.tu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    public void testSumOfSquares() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        StreamsTutorials streamsTutorials = new StreamsTutorials();
        int sumOfSquares = streamsTutorials.squareAndSum(numbers);
        int expected = 14;
        assertEquals(expected, sumOfSquares);
    }

    @Test
    public void testFilterAndCount() {
        List<String> sentences = new ArrayList<>();
        sentences.add("A man with a hat");
        sentences.add("The man has a hat and a bat");
        sentences.add("Another man with a soccer ball");

        StreamsTutorials streamsTutorials = new StreamsTutorials();
        long count = streamsTutorials.filterAndCount(sentences, 'T');
        long expected = 1;
        assertEquals(expected, count);
    }

    @Test
    public void testToUpperCase() {
        List<String> sentences = new ArrayList<>();
        sentences.add("A man with a hat");
        sentences.add("The man has a hat and a bat");
        sentences.add("Another man with a soccer ball");

        StreamsTutorials streamsTutorials = new StreamsTutorials();
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("A MAN WITH A HAT");
        expectedOutput.add("THE MAN HAS A HAT AND A BAT");
        expectedOutput.add("ANOTHER MAN WITH A SOCCER BALL");
        List<String> upperCasedStrings = streamsTutorials.upperCaseString(sentences);
        assertIterableEquals(expectedOutput, upperCasedStrings);
    }

    @Test
    public void testGetDistinct() {
        int[] input = {1, 2, 3, 3, 3, 3, 3};

        StreamsTutorials streamsTutorials = new StreamsTutorials();
        List<Integer> distinctNumbers = streamsTutorials.distinctNumber(input);
        List<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add(3);

        assertIterableEquals(expectedOutput, distinctNumbers);
    }
}