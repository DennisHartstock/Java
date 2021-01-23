package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

            do {
                System.out.println(string);
                number--;
            }
            while (number > 0 && number < 5);
    }
}