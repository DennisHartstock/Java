package com.javarush.task.pro.task05.task0503;

import java.util.Arrays;

public class Solution {

    public static int[] array = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value % 2 == 0)
                array[i] = -value;
        }
        System.out.println(Arrays.toString(array));
    }
}
