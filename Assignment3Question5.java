package com.dsa;
import java.util.Scanner;

public class Assignment3Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // area of parallelogram in java
        System.out.println("Enter the hight of parallelogram:");
        double height  = sc.nextDouble();
        System.out.println("Enter the base of paralleogram:");
        double base  = sc.nextDouble();

        if (base <= 0 || height <= 0) {
            System.out.println("Base and height must be postive :");
        } else {
            double area = height * base;
            System.out.printf(" Area = %.4f%n" , area);
        }
         sc.close();
    }
}
