package com.javarush.task.pro.task12.task1207;

public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("Первое число больше или равно второму числу");
        } else {
            System.out.println("Первое число меньше второго");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first >= second;
    }
}
