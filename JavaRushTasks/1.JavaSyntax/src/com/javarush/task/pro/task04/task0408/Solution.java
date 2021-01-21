package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            System.out.println("Введите число: ");
            int x = scanner.nextInt();
            if (x % 2 == 0 && max < x) {
                max = x;
            }
        }
        System.out.println(max);
    }
}