package com.java8FunctionalInterfaceAndlamdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
public static void main(String[] args) {
List<String> list=Arrays.asList("A","B","C");
list.forEach( System.out::println);
}
}
