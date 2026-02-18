package com.dsa;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {


//        if (fruit.equals("mango")) {
//            System.out.println("King of the fruits");
//        }
//
//        if (fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }
        // ye aise but isko easy bnane ke liye hum log switch ka use karege

        /*
        Syntax of switch

        switch(expression){
        // casses
        case one:
        // do something
        break;

        case two:
        // do something
        break;

        default;
        // do something
        }
         */

        Scanner in = new Scanner (System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of the fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;

            case " orange":
                System.out.println("round fruits");
                break;
            case " Grapes":
                System.out.println("small fruits");
                break;
            default:



        }

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println(" saturday");
            case 6 -> System.out.println("sunday");
        }











    }
}
