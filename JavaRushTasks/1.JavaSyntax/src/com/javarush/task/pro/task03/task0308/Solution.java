package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = scanner.nextInt();

        System.out.print("Введите y: ");
        int  y = scanner.nextInt();

        if (x > 0) {
            if (y > 0)
                System.out.println(1);
            else
                System.out.println(4);
        } else if (y > 0)
            System.out.println(2);
        else
            System.out.println(3);
    }
}
