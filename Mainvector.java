package com.polymorphism.OOP7;


import java.util.Vector;
import java.util.List;

public class Mainvector{
    public static void main(String[] args) {
        // Using Vector with List interface
        List<Integer> vector = new Vector<>();

        // Adding elements to Vector
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);

        // Printing Vector
        System.out.println("Vector elements: " + vector);

        // Accessing elements
        System.out.println("First element: " + vector.get(0));

        // Removing element
        vector.remove(2);
        System.out.println("After removing index 2: " + vector);

        // Iterating through Vector
        for (Integer num : vector) {
            System.out.println("Value: " + num);
        }
    }

}
