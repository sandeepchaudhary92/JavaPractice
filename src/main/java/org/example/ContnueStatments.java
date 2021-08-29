package org.example;

public class ContnueStatments {
    public static void main(String[] args) {

        // love marriage validity check
        int BoyAge = 22;
        int GirlAge = 19;
        if ((BoyAge>=22) && (GirlAge) >=18)
        {
            System.out.println(" can do marriage");
        }
        else {
            System.out.println("Child marriage");
        }

int x=1;
        int y=0;
        System.out.println(x++ + y++ + ++y - x--);
        System.out.println(x);
        System.out.println(y);

        // print number from 75 to 85
        for (int i=75; i<=85;i++){
            System.out.println(i);
        }
        // print number 10 to i
        for (int i=10; i>=1; i--)
        {
            System.out.println(i);
        }
        // print even number from 10 to 20
        for (int i=10; i<=20; i++){
            if (i%2==0){
                System.out.println("number is even " + i);
            }
        }
        // range 50 to 150 and divisble by 5

        for (int i=50; i<=150; i++){
            if (i%5==0){
                System.out.println(i);
            }
        }
    }
}
