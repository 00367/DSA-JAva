package com.dsa;
import java.util.Scanner;

public class Ass2question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take name as input from user
        System.out.println("ENter the name ");
        String name = sc.nextLine();

        // cheak if name is empty
        if (name.trim().isEmpty()) {
            System.out.println("Please enter valid name!");
        } else {
            System.out.println("Hello," + name + " ! Welcome to the program!");
        }

        sc.close();

    }
}
