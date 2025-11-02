package com.tu;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTutorials {

    /*
     * Given a List of numbers, filter even numbers and return the list of even numbers in output.
     */
    public List<Integer> filterEvenNumbers(List<Integer> input) {
        return input.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
    }

    /*
     * Given a list of numbers, square all numbers of list and return sum of squares.
     */
    public Integer squareAndSum(List<Integer> input) {
        return input.stream()
                .mapToInt(n -> n*n)
                .sum();
    }

    /*
     * Given a list of strings, filter all numbers starting with given character and return it's count.
     */
    public long filterAndCount(List<String> input, char startingCharacter) {
        return input.stream()
                .filter(x -> x != null && !x.isEmpty() && x.charAt(0) == startingCharacter)
                .count();
    }

    /*
     * Given a list of String, construct a new list where every string is in upper case
     */

    public List<String> upperCaseString(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    /*
     * Given a list of numbers, return a list of distinct numbers from original list.
     */

    public List<Integer> distinctNumber(int[] input) {
        return Arrays.stream(input).distinct().
                boxed().collect(Collectors.toList());
    }

    /*
     * Find maximum and minimum values in a List
     */

    public List<Integer> maxAndMin(List<Integer> input) {
        IntSummaryStatistics stats = input.stream()
                .mapToInt(Integer::intValue).summaryStatistics();

        return Arrays.asList(stats.getMax(), stats.getMin());
    }

    public List<String> sortAlphabeticalOrder(List<String> input) {
        return input.stream().sorted().toList();
    }

    public List<String> sortReverseAlphabeticalOrder(List<String> input) {
        return input.stream().sorted().toList().reversed();
    }

    public double getAverage(int[] input) {
        return Arrays.stream(input).average().orElse(0d);
    }

    public double getAverage(List<Integer> input) {
        return input.stream().mapToInt(Integer::intValue).average().orElse(0d);
    }

    public String concatinatedString(List<String> input) {
        return input.stream().filter(x -> !x.contains("rat")).collect(Collectors.joining());
    }

    public boolean checkIfAnyElementsGreaterThan100(List<Integer> input) {
        return input.stream().anyMatch(x -> x > 100);
    }

    public List<Person> multipleFilters(List<Person> input) {
        return input.stream().filter(x -> x.getAge()>30 && x.getGender() == 'F').collect(Collectors.toList());
    }

    public List<Integer> flattenPhoneNumbers(List<Person> input) {
        return input.stream()
                .flatMap(x -> x.getPhoneNumbers().stream())
                .filter(x -> x < 3).toList();
    }

    public Map<Integer, Integer> amountPerUser(List<Order> input) {
        return input.stream()
                .filter(x -> x.status.equalsIgnoreCase("completed"))
                .collect(Collectors.groupingBy(
                        x -> x.userId, Collectors.summingInt(x -> x.amount)
                ));
    }

    public Map<String, List<Employee>> employeeInDepartments(List<Employee> input) {
        return input.stream().collect(Collectors.groupingBy(x -> x.department));
    }

    /*
     * 14.	Partitioning: Given a List<Integer>, partition the numbers into two lists:0
     * one for even numbers and one for odd numbers.
     */

    public Map<Boolean, List<Integer>> evenAndOddNumber(List<Integer> input) {
        return input.stream().collect(Collectors.partitioningBy(x -> x%2 == 0));
    }
}
