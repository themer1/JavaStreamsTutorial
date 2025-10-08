package com.tu;

import java.util.List;
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
}
