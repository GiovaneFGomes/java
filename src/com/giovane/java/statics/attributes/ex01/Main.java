package com.giovane.java.statics.attributes.ex01;

import static com.giovane.java.statics.attributes.ex01.StaticExample.number;

public class Main {
    public static void main(String[] args) {

        // Using static in attribute, it's not necessary the instantiation of the class
        StaticExample staticExample = new StaticExample();
        staticExample.returnNumber();

        // Using the class to invoke the attribute
        System.out.println(StaticExample.number);

        // Using class static import
        System.out.println(number);

    }
}
