package com.company;

import java.util.Scanner;

public class Main {
    static int x = 10;

    public static void main(String[] args) {
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


        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = userInput.next();
        System.out.println("welcome " + name);
        System.out.println("please " + name + " Tell me about your age !");
        int age =  userInput.nextInt();
        System.out.println("welcome " + name + " your age is " + age);

//
//       int result  =  mul(2,5);
//        System.out.println(result);
// if condition
       /* int x = 20;
        int y = 9;
        int result = x + y;
        if (result > 18) {
            System.out.println("You have Allowed");
        } else if (result > 10) {
            System.out.println("you are to young and more ");
        } else {
            System.out.println("you are to young");
        }

        System.out.println(x);
        add();

    }
    public  static  void  add(){
        x = 22;
        System.out.println(x);

    }

*/


//Start For LOOP
        for (int i = 0; i < 10; i++) {
            System.out.println("I love My team");
        }
        //while
//        int i = 0;
//        while ( i < 10)
//        {
//            System.out.println(i);
//            i++;
//        }

//        int i = 10;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);

        // Switch Case
//        int myFavNum = 5;
//        switch (myFavNum){
//            case 10:
//                System.out.println("number is 10");
//                break;
//            case 15:
//                System.out.println("number is 15");
//                break;
//
//            case 20:
//                System.out.println("number is 20");
//                break;
//            default:
//                System.out.println("Not match");
//
//        }

        ///////////////////////////////////////////////////////////////////
//        System.out.println("Pls inter your favourite number");
//        Scanner userInput = new Scanner(System.in);
//        int userNumber = userInput.nextInt();
//        switch (userNumber){
//            case 0:
//                System.out.println("Your fav num is 0");
//                break;
//            case 10:
//                System.out.println("Your fav num is 10");
//                break;
//            case 20:
//                System.out.println("Your fav num is 20");
//                break;
//            case 100:
//                System.out.println("Your fav num is 100");
//                break;
//            default:
//                System.out.println("Ay kalam");
//
//        }
        System.out.println("PLS enter first Number");
        Scanner userInput = new Scanner(System.in);
        int firstNum = userInput.nextInt();

        System.out.println("PLS enter first Number");
        int secNum = userInput.nextInt();
        System.out.println("PLS choose an operation>>>>>> +,-,*,/");
        String userOperation = userInput.next();
        switch (userOperation) {
            case "+":
                System.out.println(firstNum + secNum);
                break;
            case "-":
                System.out.println(firstNum - secNum);
                break;
            case "*":
                System.out.println(firstNum * secNum);
                break;
            case "/":
                System.out.println(firstNum / secNum);
                break;
            default:
                System.out.println("Pls enter a Operation");
        }
//        // END FOR LOOP

    }
}

//
//    ///Method to sum 2 num
//    public static void add(int num1, int num2) {
//        System.out.println(num1 + num2);
//    }
//
//    //method return int
//
//    public  static  int mul(int x, int y)
//    {
//        return  x * y;
//    }

