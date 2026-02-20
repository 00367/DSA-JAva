package com.dsa;

public class Scopeing {
    public static void main(String[] args) {
        // scoping -> were we can acesss variable
        int a = 10;
        int b = 20;
        String name = "abhishek ";
        // block scop
        {

//             int a = 45 already initialised out side the block in the same method hence you can not initlaise again but you can change
            int c  = 78;
            a = 90; // ressing the origin ref variable to some other value
            // value intitialised  in this this block , will remain in block
            name = "rahul";

        }
        System.out.println(name );

        // System.out.println(c); cannot use outside the block

        // scoping in for loops
        for (int i = 0; i < 4; i++) {

            System.out.println(i);
            int num = 99;
            int c = 900;
            // int a = 10; koi bhi cheej scope ke bhar wali nhi use ker sakte but scope anke ander ki use ker sakte ho



        }





    }
    static  void random (int marks){
        int num = 34;
        System.out.println(num);
        System.out.println(marks);
    }
}
