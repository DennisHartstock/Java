package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        float n1 = scanner.nextFloat();

        System.out.print("Введите второе число: ");
        float n2 = scanner.nextFloat();

        System.out.print("Введите третье число: ");
        float n3 = scanner.nextFloat();

        if (n1 == n2) {
            if (n1 == n3) {
                System.out.println(n1 + " " + n2 + " " + n3);
            } else System.out.println(n1 + " " + n2);
        } else if (n2 == n3) {
            System.out.println(n2 + " " + n3);
        }
    }
}