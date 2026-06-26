package com.dsa;
import java.util.Scanner;

public class Assignment3Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // area of reactangle program
        System.out.println("Enter the  length of rectangle:");
        double length = sc.nextDouble();
        System.out.println("Enter the wight of rectangle:");
        double width = sc.nextDouble();

        double area = length * width;
        System.out.println("Area of rectangle = " + area);
        sc.close();
    }
}
