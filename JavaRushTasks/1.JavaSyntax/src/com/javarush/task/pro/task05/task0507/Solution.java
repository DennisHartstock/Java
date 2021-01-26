package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        System.out.print("Введите целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0)
            return;

        System.out.println("Заполните массив числами: ");
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int j : array) {
            if (j > max)
                max = j;
        }
        System.out.println(max);
    }
}
