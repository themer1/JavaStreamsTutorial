package com.tu;

import lombok.Value;
import org.junit.jupiter.api.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

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

    @Test
    public void testGetMaxAndMin() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        StreamsTutorials streamsTutorials = new StreamsTutorials();
        List<Integer> output = streamsTutorials.maxAndMin(numbers);
        for (Integer x : output) {
            System.out.println(x);
        }
    }

    @Test
    public void testSortedList() {
        List<String> sentences = new ArrayList<>();
        sentences.add("The man has a hat and a cat");
        sentences.add("A man with a hat");
        sentences.add("The man has a hat and a bat");
        sentences.add("Another man with a soccer ball");

        StreamsTutorials streamsTutorials = new StreamsTutorials();

        List<String> sorted = streamsTutorials.sortAlphabeticalOrder(sentences);

        for (String x : sorted) {
            System.out.println(x);
        }

        sorted = streamsTutorials.sortReverseAlphabeticalOrder(sentences);

        System.out.println("Reversed order printing:");
        for (String x : sorted) {
            System.out.println(x);
        }
    }

    @Test
    public void testGetAverage() {
        int[] input = {1, 2, 3};
        StreamsTutorials test = new StreamsTutorials();
        double output = test.getAverage(input);
        System.out.println(output);
    }

    @Test
    public void testGetListMaxAndMin() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);

        StreamsTutorials test = new StreamsTutorials();
        double avg = test.getAverage(numbers);
        System.out.println(avg);
    }

    @Test
    public void testConcatinatedString() {
        List<String> sentences = new ArrayList<>();
        sentences.add("The man has a hat and a cat");
        sentences.add("A man with a hat");
        sentences.add("A man with a rat");
        sentences.add("The man has a hat and a bat");
        sentences.add("Another man with a soccer ball");

        StreamsTutorials streamsTutorials = new StreamsTutorials();
        String concatinated = streamsTutorials.concatinatedString(sentences);
        System.out.println(concatinated);
    }

    @Test
    public void testIfAnyElementGreaterThan100() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(103);

        StreamsTutorials test = new StreamsTutorials();
        System.out.println(test.checkIfAnyElementsGreaterThan100(numbers));
    }

    @Test
    public void testMultiFieldFilters() {
        Person p1 = new Person("Umer", 36, 'M', new ArrayList<>());
        Person p2 = new Person("Farooq", 52, 'M', new ArrayList<>());

        Person p3 = new Person("TestMan", 12, 'F', List.of(new Integer[]{1, 2, 3, 4}));
        Person p4 = new Person("TestWoman", 32, 'F', new ArrayList<>());


        List<Person> input = List.of(p1, p2, p3, p4);


        StreamsTutorials streamsTutorials = new StreamsTutorials();
        List<Person> output = streamsTutorials.multipleFilters(input);
        for (Person x : output) {
            System.out.println(x.getName());
        }
    }

    @Test
    public void testFlatMap() {
        Person p1 = new Person("Umer", 36, 'M', new ArrayList<>());
        Person p2 = new Person("Farooq", 52, 'M', new ArrayList<>());

        Person p3 = new Person("TestMan", 12, 'F', List.of(new Integer[]{1, 2, 3, 4}));
        Person p4 = new Person("TestWoman", 32, 'F', List.of(new Integer[]{20, 22, 23, 24}));
        List<Person> input = List.of(p1, p2, p3, p4);

        List<Integer> output = (new StreamsTutorials()).flattenPhoneNumbers(input);
        for (Integer x : output) {
            System.out.println(x);
        }
    }

    @Test
    public void testAmountPerUser() {
        List<Order> orders = List.of(new Order(1, 12, 130, "completed"),
                new Order(2, 12, 135, "completed"),
                new Order(3, 13, 130, "completed"));

        Map<Integer, Integer> result = (new StreamsTutorials()).amountPerUser(orders);

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Test
    public void testEmployeesInDepartment() {
        List<Employee> employees = List.of(new Employee(1, "Technology", "Umer Farooq"),
                new Employee(1, "Corporate", "Star align"),
                new Employee(1, "City", "Teaser"),
                new Employee  (1, "Technology", "Technical Person"));

        Map<String, List<Employee>> result = (new StreamsTutorials()).employeeInDepartments(employees);

        for (Map.Entry<String, List<Employee>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Test
    public void partitionTest() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6);
        StreamsTutorials streamsTutorials = new StreamsTutorials();
        Map<Boolean, List<Integer>> output = streamsTutorials.evenAndOddNumber(input);
        for (Map.Entry<Boolean, List<Integer>> entry : output.entrySet()) {
            entry.getValue().forEach(System.out::println);
            System.out.println("----");
        }
    }
}