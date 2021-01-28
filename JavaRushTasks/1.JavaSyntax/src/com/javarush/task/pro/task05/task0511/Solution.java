package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0)
            return;

        multiArray = new int[n][];
        System.out.println("Введите числа: ");
        for (int i = 0; i < n; i++) {
            multiArray[i] = new int[scanner.nextInt()];
        }
    }
}

