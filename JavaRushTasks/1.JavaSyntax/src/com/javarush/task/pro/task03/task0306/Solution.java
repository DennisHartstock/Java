package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        float n1 = scanner.nextFloat();

        System.out.print("Введите второе число: ");
        float n2 = scanner.nextFloat();

        System.out.print("Введите третье число: ");
        float n3 = scanner.nextFloat();

        if ((n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2))
            System.out.println(TRIANGLE_EXISTS);
        else System.out.println(TRIANGLE_NOT_EXISTS);
    }
}