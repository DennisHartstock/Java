package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите скорость ветра: ");
        Scanner scanner = new Scanner(System.in);
        double speedMetersPerSecond = scanner.nextDouble();
        int speedKilometersPerHour = (int) Math.round(speedMetersPerSecond * 3.6);
        System.out.println(speedKilometersPerHour);
    }
}