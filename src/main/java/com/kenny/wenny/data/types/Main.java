package com.kenny.wenny.data.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Classes are PascalCase
public class Main {
    public static void main(String[] args) {
        // Variables are camelCase
        String message = "Hello World!";
        System.out.println(message);

        // Basic primitive type
        int numberOfTimesToRepeat = 50;
        for (int i = 0; i < numberOfTimesToRepeat; i++) {
            System.out.println("Oh yeah");
        }

        int anotherNumber = 10;
        System.out.println("50 divided by 10 is " + (numberOfTimesToRepeat / anotherNumber));

        message = "I've now re-assigned the value of message";
        System.out.println(message);

        String upperCaseMessage = message.toUpperCase();
        System.out.println("Upper case: " + upperCaseMessage);

        String firstMessage = "Hello";
        String secondMessage = firstMessage;
        firstMessage = "Goodbye";
        System.out.println(secondMessage); // Hello

        int[] myFirstArray = {1, 2, 3};
        int zerothElement = myFirstArray[0];
        System.out.println("Zeroth element: " + zerothElement);

        List<Integer> myFirstArrayList = new ArrayList<>();
        myFirstArrayList.add(1);
        myFirstArrayList.add(2);
        for (Integer element : myFirstArrayList) {
            System.out.println("I got " + element);
        }
    }
}