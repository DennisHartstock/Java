package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите числа или слово \"ENTER\", чтобы вывести сумму чисел: ");
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;

        while (!isExit) {
            String string = scanner.nextLine();

            if (string.equals("ENTER")) {
                isExit = true;
            } else {
                int x = Integer.parseInt(string);
                sum += x;
            }
        }
        System.out.println(sum);
    }
}