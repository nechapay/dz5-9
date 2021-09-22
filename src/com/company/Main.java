package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        System.out.print("Args:");
        for(String arg : args) {
            System.out.print(" " + arg);
            sum += Integer.parseInt(arg);
        }
        System.out.println("\nSum of args: " + sum);
    }
}
