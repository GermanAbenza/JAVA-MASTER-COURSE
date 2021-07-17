package academy.learnprogramming;

public class SharedDigit {

  public static boolean hasSharedDigit (int valueA, int valueB){

    if(
      valueA < 10 || valueA > 99
        || valueB < 10 || valueB > 99
    )return false;

    int copiedA = valueA;
    int copiedB = valueB;
    boolean sharedDigit = false;
    while(copiedA > 0 && !sharedDigit) {
      int lastDigitA = copiedA < 10 ? copiedA : copiedA % 10;

      while(copiedB > 0){
        int lastDigitB = copiedB < 10 ? copiedB : copiedB % 10;
        if(lastDigitB == lastDigitA){
          sharedDigit = true;
          break;
        }
        copiedB /= 10;
      }

      copiedA /= 10;
      copiedB = valueB;
    }
    return sharedDigit;
  }
}
