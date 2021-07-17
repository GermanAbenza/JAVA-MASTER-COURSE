package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value = readInteger();
        int[] array = readElements(value);
        System.out.println(array);
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce the value you want for the length of the array");
        int value =  scanner.nextInt();
        scanner.close();
        return value;
    }

    public static int[] readElements(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[arrayLength];

        System.out.println("Introduce " + myArray.length + " values for the array:");
        for(int i = 0; i < myArray.length; i++) {
            System.out.println("Value # " + (i+1) + ":");
            myArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return myArray;
    }
}
