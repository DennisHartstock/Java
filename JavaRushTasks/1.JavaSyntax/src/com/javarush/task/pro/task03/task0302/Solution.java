package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите Ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 28)
            System.out.println(name + ", явитесь в военкомат");
    }
}