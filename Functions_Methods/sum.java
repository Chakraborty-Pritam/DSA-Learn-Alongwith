package com.pritam;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        new sum();         // call function ( has some value ) . the value wil be whatever return in the sout sum function
    }

    static void sun() {               // static meaning doesnot depend on the object
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= in.nextInt();
        System.out.println("enter number 2");
        int num2 = in.nextInt();
        int sum = num1+num2 ;
        System.out.println("the sum = " + sum );     // return type
    }

    /*


     return_type name () {
    // body
    return statement;
    }


     */
}
