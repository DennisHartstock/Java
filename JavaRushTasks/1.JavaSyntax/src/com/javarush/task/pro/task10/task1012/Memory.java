package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] objects = Arrays.stream(array).filter(Objects::nonNull).toArray(String[]::new);
        for (int i = 0; i < array.length; i++) {
            array[i] = i < objects.length ? objects[i] : null;
        }
    }
}
