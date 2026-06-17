package com.dsa;
import java.util.Scanner;

public class Assignment2question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre principal amount :");
        double P = sc.nextDouble();
        System.out.println("Enter time period in years:");
        double T  = sc.nextDouble();
        System.out.println("Enter rate of interest(%):");
        double R = sc.nextDouble();
       // Calculate Simple Interest using formula :
        double SI = (P * T * R) / 100;
        // Display the result
        System.out.println("\nPrincipal Amount:" + P);
        System.out.println("Time period: " + T + " years");
        System.out.println("Rate of interest: " + R + " %");
        System.out.println("Simple Interest: " + SI );
        sc.close();
    }

}
