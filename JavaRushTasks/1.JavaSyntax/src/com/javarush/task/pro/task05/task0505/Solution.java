package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0)
            return;

        System.out.println("Заполните массив числами: ");
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = n - 1; i >= 0 ; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
