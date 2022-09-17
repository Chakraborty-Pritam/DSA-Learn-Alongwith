package com.pritam;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Q: take input of two numbers and print the sum
        Scanner in = new Scanner(System.in);

        System.out.println("enter number 1");
        int num1= in.nextInt();
        System.out.println("enter number 2");
        int num2 = in.nextInt();
        int sum = num1+num2 ;
        System.out.println("the sum = " + sum );

    }
}
