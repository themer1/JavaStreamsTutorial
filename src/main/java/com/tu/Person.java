package com.tu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private char gender;

    private List<Integer> phoneNumbers;
}
