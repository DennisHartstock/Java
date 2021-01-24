package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        System.out.print("Напишите \"true\" или \"false\": ");
        Scanner scanner = new Scanner(System.in);
        boolean isAnswer = scanner.nextBoolean();

        int result = isAnswer ? (int) Math.ceil(glass) : (int) Math.floor(glass);
        System.out.println(result);
    }
}