package com.dsa;
import java.util.Scanner;

public class Assignment3Quest1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // write a program for Area of circle
        double radius , area ;
        System.out.println("Enter the radius of the circle:");
        radius = sc .nextDouble();

        // area = radius * radius *MAth.PI

        area = radius * radius * Math.PI;
        System.out.println("Area of the circle is: " + area);
        sc.close();

    }
}
