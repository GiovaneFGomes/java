package com.giovane.java.statics.attributes.ex01;

public class StaticExample {

    public static int number = 10;

    public void returnNumber() {
        System.out.println(number);
    }

}

//  If we declare the variable as static, the variable no longer belongs to each object, but to the class.
//  This means that, in memory there will be one space for the variable and two spaces for the objects.
//  The attribute will be the same to the class' objects.
