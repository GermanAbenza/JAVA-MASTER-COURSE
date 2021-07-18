package com.timbuchalka;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void reverse(int[] myArray){

        System.out.println("Array = " + Arrays.toString(myArray));
        // int middle = (myArray.length % 2 == 0) ? myArray.length / 2 : (myArray.length - 1) / 2;
        // the logic above is not necessary since type int will floor any floating result.
        int middle = myArray.length / 2;

        for(int i = 0 ; i < middle; i++){
            int temp = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = myArray[i];
            myArray[i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(myArray));
    }
}
