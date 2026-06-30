package com.dsa;
import java.util.Scanner;

public class Assignment3Quest7 {
    public static void main(String[] args) {
        // area of Equilateral Traingle
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of tringle:");
        double side  = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * side * side ;
        System.out.println("The area of tringle is " + area);
        sc.close();

    }
}
