package com.company;

public class MathExercises {
    public static int digitSwapper(int input) {
        int numOne = input % 10;
        int numTen = input / 10 % 10;
        int z = input - (numOne + numTen * 10);
        return z + numOne * 10 + numTen;
    }


    public static void timeLeft(int currHour, int currMin, int depHour, int depMin) {
        int hourToMin = currHour * 60;
        int curMinTotal = hourToMin + currMin;
        int depHourToMin = depHour * 60;
        int depMinTotal = depHourToMin + depMin;
        int waitTime = depMinTotal - curMinTotal;
        int A = waitTime / 60;
        int B = waitTime % 60;
        System.out.println("The train is arriving in " + A + "hours and " + B + " minutes.");
    }

    public static int dayOfWeek(int daysOfWeek1, int day) {
        int x = daysOfWeek1 + day - 1;
        int y = x % 7;
        return y;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 6;
        output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input + " " + output);
        timeLeft(1, 34, 8, 20);
        timeLeft(1, 15, 4, 36);

        System.out.println(dayOfWeek(0, 1));
        System.out.println(dayOfWeek(0, 14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1, 24));
        System.out.println(dayOfWeek(2, 1));

    }
}