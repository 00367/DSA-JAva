package com.dsa;

import java.util.Scanner;

public class conditinal {
    public static void main(String[] args) {
      /*
      Syntax  of for loop:

      for (initilisation; condition; increment/decrement) {
      // body
      }
       */

        // Q: Print number from 1 to 5
//        for ( int num = 1; num <= 9; num += 2) {
//            System.out.println(num);



        // print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

       // while loop
    /*

    Syntax :

    while (condition) {
    // body
    }
     */

    int num =1 ;
    while ( num < 5) {
        System.out.println(num);
        num += 1;


    }

    // do while loop
        /*

        do {
        } while (condition);

         */

        int n = 1 ;
        do {
            System.out.println( "hello world ");

        } while (n != 1);



    }
}
