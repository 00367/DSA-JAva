package com.dsa;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 34;
        arr[3] = 78;
        arr[4] = 90;

        //  [ 23  , 45, 34, 78, 90] // internally aise hi save hua hoga

        // many times array ko likhna ho to  using for loop

        for ( int i = 0; i < arr.length; i++ ) {
            arr [i] = in.nextInt();

        }

        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");

        }

        for ( int num : arr) { // for every element of array , print the element
            System.out.print(num + " "); // here num represent elements of the array

        }


    }
}
