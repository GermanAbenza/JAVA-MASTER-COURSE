package academy.learnprogramming;

public class TeenNumberChecker {
  public static boolean hasTeen (int valueA, int valueB, int valueC){

    if (
        (valueA >= 13 && valueA <= 19) ||
            (valueB >= 13 && valueB <= 19) ||
            (valueC >= 13 && valueC <= 19)
    ) return true;
    return false;
  }

  public static boolean isTeen(int value){
    return value >= 13 && value <= 19;
  }
}

