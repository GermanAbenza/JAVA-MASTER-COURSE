package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int value = readInteger();
        int[] returnedArray = readElements(value);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
    }

    private static int readInteger() {

        System.out.println("Introduce the value you want for the length of the array");
        int value =  scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    private static int[] readElements(int arrayLength) {
        int[] myArray = new int[arrayLength];

        System.out.println("Introduce " + myArray.length + " values for the array:");
        for(int i = 0; i < myArray.length; i++) {
            System.out.println("Value # " + (i+1) + ":");
            int number = scanner.nextInt();
            scanner.nextLine();
            myArray[i] = number;
        }
        return myArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            int value = array[i];

            if(value < min){
                min = value;
            }
        }

        return min;
    }
}
