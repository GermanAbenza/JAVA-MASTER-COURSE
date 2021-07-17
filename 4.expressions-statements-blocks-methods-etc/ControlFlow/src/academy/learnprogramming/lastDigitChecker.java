package academy.learnprogramming;

public class lastDigitChecker {

  public static boolean hasSameLastDigit(int valueA, int valueB, int valueC){

    if(
      isValid(valueA) &&
      isValid(valueB) &&
      isValid(valueC)
    ){
      return(
        valueA % 10 == valueB % 10
          || valueA % 10 == valueC % 10
          || valueB % 10 == valueC % 10
      );
    }
    return false;
  }

  public static boolean isValid (int number){
    return number >= 10 && number <= 1000;
  }
}
