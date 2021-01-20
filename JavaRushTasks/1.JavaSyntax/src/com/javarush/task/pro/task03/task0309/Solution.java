package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        int max = numberA < numberB ? numberB : numberA;
        System.out.println(max);
    }
}
