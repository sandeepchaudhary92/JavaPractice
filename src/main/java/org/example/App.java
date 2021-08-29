package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Integer[] math = new Integer[5];
        math[0]=111;
        math[3]=7777;
        int position = 3;
        int a=1;
        int i;
        for (i=0; i<math.length;i++)
        {
            if(i==position){
                math[i]=33;
//                System.out.println(math[i]);
                System.out.println(math[4]);
            }
        }

//        System.out.println("math = " + math);
//        System.out.println(Arrays.toString(math));
//        double[] dd= new double[3];
//        dd[0]=1222;
//        dd [1]=23.44;
//        System.out.println(Arrays.toString(dd));

        int val =6;
        ArrayList<Integer> mathlist = new ArrayList<Integer>(Arrays.<Integer>asList(math));
        mathlist.add(val);
        math=mathlist.toArray(math);
        System.out.println(Arrays.toString(math));
        System.out.println(math.length);
    }
}
