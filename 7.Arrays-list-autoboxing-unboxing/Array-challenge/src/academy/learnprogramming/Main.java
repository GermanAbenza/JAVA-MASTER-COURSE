package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        printArray(array);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            // element 0     160
            // element 1     50
            // element 2     40

            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void printArray(int[] intArray){

        for(int i = 0; i < intArray.length; i++){
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public static int[] getIntegers(int number) {

        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[number];

        System.out.println("Introduce your values for the array:\n");
        for( int i = 0; i < myArray.length; i++){
            myArray[i] = scanner.nextInt();
        }
        System.out.println("Array of length " + number + "created.");
        return myArray;
    }
}
