package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	 /* int x = 4;
     System.out.println(x);
     //reassign value
     x = 8;
     String myName= "Ashraf";
     System.out.println(x);

     // primitive data type(8)
        byte a = 10;
        short b = 20;
        int u = 30;
        long z = 5000;
        float o = 3.5F;
        double h = 6.6;

        char myFirstLetter = 'A'; //single cot
        boolean isDone = true;

        //non-Primitive String-array-
        String name = "Ashraf Fathalla";
        */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = userInput.next();
        System.out.println("welcome " + name);
        System.out.println("please " + name + " Tell me about your age !");
        int age =  userInput.nextInt();
        System.out.println("welcome " + name + " your age is " + age);
    }
}
