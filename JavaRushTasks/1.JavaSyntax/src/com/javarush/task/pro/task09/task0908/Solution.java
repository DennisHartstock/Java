package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null || binaryNumber.isEmpty() || !Pattern.matches("[0-1]+", binaryNumber)) {
            return hexNumber;
        }
        
        StringBuilder temp = new StringBuilder();
        if (binaryNumber.length() % 4 == 1) {
            temp.append("000").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 2) {
            temp.append("00").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 3) {
            temp.append("0").append(binaryNumber);
        } else {
            temp.append(binaryNumber);
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < temp.length(); i += 4) {
            String substring = temp.substring(i, i + 4);
            result.append(switch (substring) {
                case "0001" -> "1";
                case "0010" -> "2";
                case "0011" -> "3";
                case "0100" -> "4";
                case "0101" -> "5";
                case "0110" -> "6";
                case "0111" -> "7";
                case "1000" -> "8";
                case "1001" -> "9";
                case "1010" -> "a";
                case "1011" -> "b";
                case "1100" -> "c";
                case "1101" -> "d";
                case "1110" -> "e";
                case "1111" -> "f";
                default -> "0";
            });
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null || hexNumber.isEmpty() || !Pattern.matches("[0-9a-f]+", hexNumber)) {
            return binaryNumber;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            result.append(switch (hexNumber.charAt(i)) {
                case '1' -> "0001";
                case '2' -> "0010";
                case '3' -> "0011";
                case '4' -> "0100";
                case '5' -> "0101";
                case '6' -> "0110";
                case '7' -> "0111";
                case '8' -> "1000";
                case '9' -> "1001";
                case 'a' -> "1010";
                case 'b' -> "1011";
                case 'c' -> "1100";
                case 'd' -> "1101";
                case 'e' -> "1110";
                case 'f' -> "1111";
                default -> "0000";
            });
        }
        return result.toString();
    }
}
