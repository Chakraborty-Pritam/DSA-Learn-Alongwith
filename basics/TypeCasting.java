package com.pritam;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
 //       Scanner input = new Scanner(System.in);
 //       float num = input.nextFloat();
 //       System.out.println(num);


        // type casting
    //    int num= (int)(67.56f);
    //    System.out.println(num);

        //automatic type promotion in expression
     //   int a = 257;
    //    byte b = (byte)(a);


        byte b =42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234 ;
        double result = ( f * b) + (i/c) - (d-s);
        //float + integer - double = double  ( double is the biggest among int,float and double  so the end result should also be in double)
        System.out.println((f*b) + "" + (i/c) + "" + (d-s));
        System.out.println(result);


    }
}
