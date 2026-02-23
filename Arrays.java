package com.dsa;

public class Arrays {
    public static void main(String[] args) {
        //  why we need array
        // Q: store a roll number
        int a = 19;

        // Q : store a person's name
        String name = "abhishek yadav";

        // Q : store 5 roll numbers
        int roll1 = 23;
        int roll2 = 34;

        // Array -> it is collection of data types (primitive , complex , etc ) whatever you want to save the data.
        // santax
        /*
        datatype[ ] variable _name = name datatype [size];
        ex - > store 5 roll number:

        array object are in heap
        heap object are not continous
        daynamic memory allocation ( array may not be continous-> it depends on JVM)






         */

        // store 5 roll number
        int []  rons = new int[5];
        // new -> used for create an object
        // or directly
         int[] rons2 = { 23, 45, 32 , 15};
         // all type of data in the array should be same ( int mai int hi hona chahiye string gager likhe ge to error create aa jaiga )
        int[] ros; // declaration  of array , ros is  getting defined in the stack.
        ros = new int[5]; //  initialistion actually here object is being create in the memory (heap).


        String[] arr = new String[4];









    }

}
