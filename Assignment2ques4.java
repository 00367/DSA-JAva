package com.dsa;
import java.util.Scanner;

public class Assignment2ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 , num2, result;
        char op;
        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();
        System.out.println("Enter operator ( + , - , * , / , ):");
        op = sc.next().charAt(0);

        if (op ==  '+') {
            result = num1 + num2;
            System.out.println("Result = " + result);
        } else if ( op == '-'){
            result = num1 - num2;
        } else if ( op == '*') {
            result = num1 * num2;
            System.out.println("Result = " + result);
        } else if ( op == '/');
        if (num2 != 0){
            result = num2 / num1;
            System.out.println("Result = " + result);

        } else {
            System.out.println(" Error : Division by zero is not allowed");
        }

        sc.close();



    }
}
