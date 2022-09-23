package com.pritam;

public class Scope {         // scope means where we can access our variables
    public static void main(String[] args) {
        int a = 10;
        int b= 20 ;

        {
 //          int a=78; //already initialized outside the block in the same method , hence you cannot initialise again
           a = 100;     // reassign the original ref variable to some other value
            System.out.println(a);


            int c = 99 ;
            //values initialized in this block , will remain in this block
        }

//        System.out.println(c);    // cannot use outside the block
    }

    static void random() {
        System.out.println();
    }
}


         // anything that is initialized outside can be used inside the block but not vice versa