package com.dsa;

public class Shadowing {
     static int x = 90 ; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // print 90
        int x ; // class variable at line 4 is shoadowd by this

       // System.out.println(); scope will begin when value is initalised

        x = 40;

        System.out.println(x); // print 40
        fun();


    }
    static  void fun() {
        System.out.println(x);
    }

}
