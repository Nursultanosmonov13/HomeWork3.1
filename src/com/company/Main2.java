package com.company;


import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        double[] myArrays = {-1.1, 12.1, 9.5, -6.3, -3.12, 23.1, 5.14, 3.2, 3.3, 10.6, -12.9, 6.8, 2.9, 8.3, 2.2};
        System.out.println(Arrays.toString(myArrays));
        for (int i = 0; i < myArrays.length; i++) {
            double value = myArrays[i];
            //System.out.println(value);
            //double myleft = i - 1;
            // System.out.println(myleft);
            int myleft = i - 1;
            for (; myleft >= 0; myleft--) {
                if (value < myArrays[myleft]) {
                    myArrays[myleft + 1] = myArrays[myleft];
                } else {
                    break;
                }
            }
            myArrays[myleft + 1] = value;
            System.out.println(Arrays.toString(myArrays));
        }


    }
}

