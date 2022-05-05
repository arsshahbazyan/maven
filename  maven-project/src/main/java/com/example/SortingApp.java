package com.example;

import java.util.Arrays;
import java.util.Scanner;


/**
 * App for sorting integer values received from command line
 * @author Arsen Shahbazyan
 * @version 1.0
 */
public class SortingApp {

    /**
     * main() function which get integers from input
     * parse it to array and then print out the array
     * by calling sort() method
     */
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine()
                        .trim()
                        .split(", "))
                .filter(x -> !x.equals(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Arrays.toString(sort(arr)));
    }

    /**
     * Function for sorting the array received from command line
     * @return array
     */

    public static int[] sort(int[] array) {
        if (array != null && array.length <= 10) {
            Arrays.sort(array);
        } else if (array == null) {
            throw new NullPointerException();
        } else {
            throw new IllegalArgumentException();
        }
        return array;
    }
}
