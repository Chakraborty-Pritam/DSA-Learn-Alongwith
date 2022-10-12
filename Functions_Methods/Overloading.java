package com.pritam;


public class Overloading {

    public static void main(String[] args) {
    fun(a:69);
    fun(name:"pritam chakraborty");
    }

    static void fun(int a ) {
        System.out.println(a);

    }

    static void fun(String name) {
        System.out.println(name);

    }
}
