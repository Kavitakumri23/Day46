package com.polymorphism.OOP7;



public class Enum {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // Enum constants are public, static, and final
        // Cannot create child enums
    }

    public static void main(String[] args) {
        Week day = Week.Monday;

        // Printing enum
        System.out.println(day);

        // Looping through enums
        for (Week w : Week.values()) {
            System.out.println(w);
        }
    }
}
