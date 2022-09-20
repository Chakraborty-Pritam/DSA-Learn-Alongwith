package com.pritam;

import java.util.Arrays;

public class VarLengthArgs {
    public static void main(String[] args) {
       fun(...v:1,2,3,4,5)
    }

    static void fun(int ...v) {

        System.out.println(Arrays.toString(v));
    }
}
