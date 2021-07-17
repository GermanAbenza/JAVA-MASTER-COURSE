package academy.learnprogramming;

public class Main {

  public static void main(String[] args) {

    int myValue = 10000;
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Minimum Value: " + myMinIntValue);
    System.out.println("Integer Minimum Value: " + myMaxIntValue);
    System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
    System.out.println("Busted Min Value = " + (myMinIntValue - 1));

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue);
    System.out.println("Short Maximum Value = " + myMaxShortValue);

    long myLongValue = 2_147_483_647_234L;
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinLongValue);
    System.out.println("Short Maximum Value = " + myMaxLongValue);

    short bigShortLiteralValue = 32767;

    int myTotal = (myMinIntValue / 2);
    byte myNewByteValue = (byte) (myMinByteValue / 2);
      // Casting type. content inside brackets is no longer treated as an int type
    short myNewShortValue = (short) (myMinShortValue / 2);

    /*
    * Create a byte variable and set it to any valid byte number, do the same with a short number.
    * Create an int and set to any int value. Lastly, create a long value and make it equal to 50000 plus
    * 10 times the sum of the byte plus the short plus the integer values
    * */

    byte randomByte = 100;
    short randomShort = 13099;
    int randomInteger = 23142312;
    long totalLong = 50000L + 10L * (randomInteger + randomByte + randomShort);
    System.out.println("totalLong value : " + totalLong);
  }
}
