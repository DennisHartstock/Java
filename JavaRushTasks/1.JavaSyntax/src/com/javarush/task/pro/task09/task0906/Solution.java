package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        StringBuilder binaryNumber = new StringBuilder();
        if (decimalNumber <= 0) {
            return binaryNumber.toString();
        }
        
        while (decimalNumber != 0) {
            binaryNumber.append(decimalNumber % 2);
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber.toString();
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;
        if (binaryNumber == null || binaryNumber.isEmpty() || !Pattern.matches("[0-1]+", binaryNumber)) {
            return decimalNumber;
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber += value * Math.pow(2, i);
        }
        return decimalNumber;
    }
}