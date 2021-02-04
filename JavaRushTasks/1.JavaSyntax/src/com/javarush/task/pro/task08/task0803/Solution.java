package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int n : ints)
            min = Math.min(min, n);
        return min;
    }

    public static int[] getArrayOfTenElements() {
        System.out.println("Введите десять чисел: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
