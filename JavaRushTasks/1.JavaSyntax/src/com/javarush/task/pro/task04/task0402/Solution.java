package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите имя девушки: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String text = " любит меня.";

        int i = 0;
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
    }
}
