package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double value1 = 20d;
        double value2 = 80d;
        double result1 = (value1 + value2) * 100;
        double remainder = result1 % 40;

        // boolean isExact = remainder == 0 ? true : false; ==> simplified syntax below
        boolean isExact = remainder == 0;
        System.out.println("assessing whether " + result1 + " divided by 40 is exact: " + isExact );

        if(!isExact) System.out.println("Got some remainder");
    }
}
