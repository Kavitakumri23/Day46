package com.polymorphism.OOP7;
import java.util.*;
public class CollectionFrame {
        public static void main(String[] args) {
            // Using ArrayList
            List<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("C++");

            System.out.println("ArrayList: " + list);


            // Using HashSet
            Set<Integer> set = new HashSet<>();
            set.add(10);
            set.add(20);
            set.add(20); // Duplicate not allowed

            // use only for understanding
            System.out.println("HashSet: " + set);
        }
}