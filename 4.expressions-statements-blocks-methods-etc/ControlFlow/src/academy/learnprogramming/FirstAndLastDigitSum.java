package academy.learnprogramming;

public class FirstAndLastDigitSum {

  public static int sumFirstAndLastDigit(int number) {
    if(number < 0) return -1;
    int lastDigit = number >= 10 ? number % 10 : number;
    int firstDigit = number;
    while (number >= 10){
      firstDigit = number /= 10;
    }
    return firstDigit + lastDigit;
  }
}
