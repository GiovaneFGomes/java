package com.giovane.java.statics.attributes.ex02;

public class Car {

    // Attribute initialized
    public static int total = 0;

    // This is an example of using static in the attribute
    // The total attribute is added in the constructor to count and show whenever an object is instantiated
    public Car() {
        total++;
        System.out.println("Object created. Exists " +total+" objects of this class.");
    }

}

