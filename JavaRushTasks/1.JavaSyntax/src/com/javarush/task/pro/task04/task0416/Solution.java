package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner scanner = new Scanner(System.in);
        int cansOfCola = scanner.nextInt();
        int programmers = scanner.nextInt();

        double colaPerProgrammers = ((cansOfCola * 1.0) / programmers);
        System.out.println(colaPerProgrammers);
    }
}