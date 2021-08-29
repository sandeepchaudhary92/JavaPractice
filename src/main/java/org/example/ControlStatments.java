package org.example;

public class ControlStatments {
    public static void main(String[] args) {

        int b = 44;
        int c = 22;
        int a = b + c;
        System.out.println("total of a is " + a);
        int age = 18;
        if (a >= age) {
            System.out.println(age + " is eligible for voating");
        } else {
            System.out.println(age + " is not eligible for voating");
        }
        int n = 9;
        if (n % 2 == 0)
        {
            System.out.println(n + " is even numbar");
        }else{
            System.out.println(n + " is odd number");
        }
        // printing number till 100
        for (int i=1; i<=100; i++){
            System.out.println(i);
            if ((i%5==0) && (i%7)==0){

                System.out.println("Hero Sandeep");
            }
            else {
                System.out.println("Rock java");
            }

            }
        }


    }

