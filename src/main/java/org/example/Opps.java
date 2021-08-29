package org.example;

public class Opps {
    public static void main(String[] args) {

        int a =22;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(++a+a++);
        int x=1;
        int y=0;
        System.out.println(x++ + y++ + ++y - x--);
        Opps logics = new Opps();
        logics.logic();
        logics.counts();
    }
    public void logic(){
        for (int i =10; i<=20; i++){
            if (i%2==0){
                System.out.println("even number is "+i);
            }
            else {
                System.out.println("Number is odd "+i);
            }
        }
    }
    int count=0;
    private void counts(){
        for (int i=20; i<=120; i++){
            if (i%7==0)
            {count++;
                System.out.println("number divided is "+i);
            }


        }
        System.out.println("totoal number is "+count);
    }
}
