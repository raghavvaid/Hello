package com.company;


public class YummyFood {
    public static void main(String[] args) {
        System.out.print("Yummy ");
        System.out.println("Food");
        chocolate();
        chocolate();
        iceCream();
        System.out.println("done");
    }
    public static void chocolate(){
        System.out.println("Chocolate");

    }
    public static void iceCream(){
        System.out.println("Chunky Chocolate Pudding");
        chocolate();
        System.out.println("that was yummy");
    }
}