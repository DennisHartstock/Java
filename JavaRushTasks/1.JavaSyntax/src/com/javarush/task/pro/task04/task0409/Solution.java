package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            System.out.print("Введите число: ");
            int x = scanner.nextInt();

            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
    }
}