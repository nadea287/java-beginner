package com.company;

import java.util.Arrays;

public class Test {
    public double absoluteValue(double $param) {
        if ($param < 0) {
            return $param * -1;
        }

        return $param;
    }

    public double calculateTip(double mealCost) {
        return (mealCost / 100) * 15;
    }

    public String nameTagText(String name) {
        return "Hello, my name is " + name;
    }

    public double fahrenheitToCelsius(double fahrenheitTemperature) {
        //from fahrenheit to celsius
        return (fahrenheitTemperature - 32) * 5 / 9;
    }

    /**
     * Converts from Fahrenheit to Celsius degrees.
     *
     * @param fahrenheitTemperature
     * @reurn Equivalent temperature in degrees Celsius.
     */
    public void printTemperature(double fahrenheitTemperature) {
        System.out.println("F: " + fahrenheitTemperature);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheitTemperature));
    }

    public int monopolyRoll() {
        int numberOne = generateRandomNumber();
        int numberTwo = generateRandomNumber();

        if (numberOne == numberTwo) {
            int numberThree = generateRandomNumber();
            int numberFour = generateRandomNumber();

            return numberOne + numberTwo + numberThree + numberFour;
        }
        return (int) numberOne + (int) numberTwo;

    }

    private int generateRandomNumber() {
        double randomNumber = Math.random();
        randomNumber *= 6;
        randomNumber += 1;
        return (int) randomNumber;
    }

    public int countBlocks(int levels) {
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            total = total + (i * i);
        }
        return total;
    }

    public String findLongestName(String[] names) {
        int namesLength = names.length;
        String longestName = "";

        for (int i = 0; i < namesLength; i++) {
            if (longestName.length() < names[i].length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int indexOfFirstOccurrence(String[] stringArray, String target) {
        int arrayLength = stringArray.length;
        for (int i = 0; i < arrayLength; i++) {
            if (target.equals(stringArray[i])) {
                return i;
            }
        }
        return -1;
    }

    public int yearsTilOneMillion(double initialBalance) {
        int flag = 0;
        while (initialBalance < 1000000) {
            double income = (int) (initialBalance / 100) * 5;
            initialBalance += income;
            flag++;

        }
        return flag;
    }

    //Q5
    public void printInReverse(String[] stringArray) {
        String reversedStringArray[];
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i] + " ");
        }
    }

    public int findRange(int[] intArray) {

        if (intArray.length != 0) {
            int arrayLength = intArray.length;
            int largestValue = findMax(intArray, arrayLength);
            int smallestValue = findMin(intArray, arrayLength);
            return largestValue - smallestValue;
        }
        return -1;
    }

    private int findMax(int arr[], int arrayLength) {
        int result = arr[0];
        for (int i = 0; i < arrayLength; i++) {
            if (result < arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

    private int findMin(int arr[], int arrayLength)
    {
        int result = arr[0];
        for (int i = 0; i < arrayLength; i++) {
            if (result > arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

    public int monopolyRollExtended()
    {
        int randomNumberOne = rollDice();
        int randomNumberTwo = rollDice();
        int totalRolls = 0;

        while (randomNumberOne != randomNumberTwo) {
            randomNumberOne = rollDice();
            randomNumberTwo = rollDice();
            totalRolls++;
            return totalRolls;
        }
        return 0;
    }

    private int rollDice()
    {
        return (int) (Math.random() * 6 + 1);
    }
}
