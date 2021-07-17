package academy.learnprogramming;

public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces (double valueA, double valueB){

    return (int) (valueA * 1000) - (int) (valueB * 1000) == 0;
  }
}
