package com.javarush.task.pro.task10.task1016;

public class Solution {

    public static void showWeather(City city) {
        System.out.printf("В городе %s сегодня температура воздуха %d%n", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {
        City city = new City("Sarstedt", -15);
        showWeather(city);
    }
}
