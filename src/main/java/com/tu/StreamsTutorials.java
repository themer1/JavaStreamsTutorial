package com.tu;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsTutorials {

    /*
     * Given a List, filter even numbers and return the list of even numbers in output.
     */
    public List<Integer> filterEvenNumbers(List<Integer> input) {
        return input.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
    }
}
