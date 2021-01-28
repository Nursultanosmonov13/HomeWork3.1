package com.company;

public class Main {

    public static void main(String[] args) {
        double[] myArrey = {1.1, 12.1, 9.5, -6.3, -3.12, 23.1, 5.14, 3.2, 3.3, 10.6, 12.9, 6.8, 2.9, 8.3};
        double sumNumber = 0;
        double result = 0;
        int count = 0;
        boolean negatNumber = false;
        for (double temp : myArrey) {
            if (temp < 0) {
                negatNumber = true;
                //System.out.println(negatNumber);
                continue;
            }
            if (negatNumber) {
                if (temp > 0) {
                    //System.out.println("temp " + temp);
                    //sumNumber = temp;
                    count = count + 1;
                    sumNumber = sumNumber + temp;
                    result = sumNumber / count;

                }

            }

        }
        System.out.println("count - " + count);
        System.out.println("sumNumber - " + sumNumber);
        System.out.println("Резултат - " + result);
    }
}