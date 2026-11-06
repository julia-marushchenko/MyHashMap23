/**
 *  Java program to create, display, update HashMap instance.
 */

package com.mycollections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Map<Integer, Double> myMap = new HashMap<>();

        // Add.
        myMap.put(2, 9.8);
        myMap.put(1, 7.8);

        // Print.
        System.out.println(myMap); // Output: {1=7.8, 2=9.8}

        // Update.
        myMap.put(2, 4.1);

        // Print.
        System.out.println(myMap); // Output: {1=7.8, 2=4.1}

        // Replace element with key 2.
        myMap.replace(2, 1000.0);

        // Print.
        System.out.println(myMap); // Output: {1=7.8, 2=1000.0}

        // Clear.
        myMap.clear();

    }
}