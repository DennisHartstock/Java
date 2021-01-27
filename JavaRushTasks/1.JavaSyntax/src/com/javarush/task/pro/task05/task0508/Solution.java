package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        System.out.println("Введите слова: ");
        Scanner scanner = new Scanner(System.in);
        strings = new String[10];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];

            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        Arrays.stream(strings).forEach(System.out::println);
    }
}
