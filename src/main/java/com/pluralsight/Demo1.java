package com.pluralsight;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Hey Class");

        String name = "Oabid";
        String greetings = "Hello" + name;
        System.out.println("Hello World");

        char status = 'm';
        int identifier = 1;


        String greeting = "Hello " + name;


        int numberOfDaysPerWeekWatchesTV = 5;
        int minutesPerDayOnDayWatchedOnAverage = 70;

        int minutesPerWeek = numberOfDaysPerWeekWatchesTV * minutesPerDayOnDayWatchedOnAverage;
        int minutesPerYear = minutesPerWeek * 52;

        int hoursPerYear = minutesPerYear / 60;

        int hoursInWorkWeek = 35;

        int workWeeksPerYearWatchingTV = hoursPerYear / hoursInWorkWeek;

        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeeksPerYearWatchingTV + " week vacation every year");
        System.out.println(greeting);

    }
}
