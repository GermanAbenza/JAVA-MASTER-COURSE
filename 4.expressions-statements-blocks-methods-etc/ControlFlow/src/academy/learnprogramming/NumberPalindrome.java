package academy.learnprogramming;

public class NumberPalindrome {
  public static boolean isPalindrome (int number) {

    number = Math.abs(number);
    int reversedNumber = 0;
    int iteration = 1;

    while(number > 0){
      int lastDigit = number % 10;
      number /= 10;
      reversedNumber = reversedNumber * iteration + lastDigit;
      iteration *= 10;
    }
    return reversedNumber == number;
  }
}
