package org.example;

public class CountNumbers {
    public static void main(String[] args) {

        int count=0;
        for (int i =20; i<=120; i++){

            if (i%7==0){
                count++;

            }

        }
        System.out.println(count);
    }
}
