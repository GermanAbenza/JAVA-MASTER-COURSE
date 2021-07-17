package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Float type ==> 32 bits <=> 4 bytes
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        // Double ==> 64 bits ,=> 8 bytes
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinDoubleValue);
        System.out.println("Float maximum value: " + myMaxDoubleValue);

        int myIntValue  = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5.0 / 2.0; // default type for decimal values
        System.out.println(myDoubleValue);

        // Convert a given number of pounds to kilograms:

        double poundsConvertRatio = 0.4_535_923_7;
        short poundsValue = 135;
        double convertResult = poundsValue * poundsConvertRatio;
        System.out.println(poundsValue + " pounds are " + convertResult + " kilograms");
    }
}
