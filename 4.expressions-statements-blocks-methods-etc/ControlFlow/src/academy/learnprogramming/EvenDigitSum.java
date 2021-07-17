package academy.learnprogramming;

public class EvenDigitSum {

  public static int getEvenDigitSum (int number) {

    if (number < 0) return -1;

    int copiedNumber = number;
    int sum = 0;
    while (copiedNumber > 0){

      int lastDigit = copiedNumber % 10;
      if(lastDigit % 2 == 0){
        sum += lastDigit;
      }
      copiedNumber /= 10;
    }

    return sum;
  }
}
