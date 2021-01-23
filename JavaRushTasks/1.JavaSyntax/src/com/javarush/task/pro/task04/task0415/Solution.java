package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double pi = 3.14;

        if (radius > 0) {
            double square = pi * radius * radius;
            System.out.println((int) square);
        }
    }
}