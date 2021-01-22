package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;


public class Solution {
    static int secondMin;

    public static void main(String[] args) {
        System.out.println("Введите как минимум два числа: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1 = scanner.nextInt();

        secondMin = n < n1 ? n1 : n;

        while (scanner.hasNextInt()) {
            int tmp = scanner.nextInt();

            if (tmp < secondMin)
                secondMin = tmp;
        }
        System.out.println(secondMin);
    }
}