package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 25, 3, 4, 10, 9, 6, 15, 4, 6};
        largestNumber(intArray);
    }

    private static void largestNumber(int[] intArray) {

        int largestNumber = intArray[0];

        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] > largestNumber)
                largestNumber=intArray[i];
        }
        System.out.println(largestNumber);
    }
}