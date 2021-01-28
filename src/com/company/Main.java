package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // double[] myArrays = {1.1, 12.1, 9.5, -6.3, -3.12, 23.1, 5.14, 3.2, 3.3, 10.6, -12.9, 6.8, 2.9, 8.3, 2.2};
        //double result = 0;
        int [] myArrays ={8, -2, -4, 2, 3, 6};
        int sum = 0;
        int count = 0;
        int result = 0;
        boolean firstMinusElementFound = false;
        for (int item : myArrays) {
            if (item < 0){
                firstMinusElementFound = true;
                // System.out.println("firstMinusElementFound " + firstMinusElementFound);
                continue;
            }

                if (item > 0){
                    count++;
                    sum = sum + item;
                }

        }
        System.out.println("sum "+sum);
        System.out.println("count "+count);
        result = sum/count;
        System.out.println("result "+result);
    }

}