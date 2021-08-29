package org.example;

import java.util.Arrays;

public class MoreArrays {
// adding a new slot and new val and shift one value to other
        public static void main(String[] args)
        {
            // Original array with size 5
            Integer odd_Array[] = { 1,3,7,9,11 };

            // display the original array
            System.out.println("Original Array:" + Arrays.toString(odd_Array));
            // element to be added at index
            int val = 5;
            int index = 2;
            //dest array with size more than 1 of the original array
            int[] dest_Array = new int[odd_Array.length+1];
            int j = 0;
            //Iterate dest_array and insert new element as well as shift other elements to the right
            for(int i = 0; i<dest_Array.length; i++) {
            if(i == index) {
                dest_Array[i] = val;
            }
            else {
                dest_Array[i] = odd_Array[j];
                j++;
            }
        }
            // display the updated array
            System.out.println("\nArray after adding element " + val + " at index " + index +":"
                    + Arrays.toString(dest_Array));
        }
    }
