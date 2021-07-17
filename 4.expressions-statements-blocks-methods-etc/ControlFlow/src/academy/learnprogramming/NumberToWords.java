package academy.learnprogramming;

public class NumberToWords {

  public static void numberToWords (int number){

    if(number < 0){
      System.out.println("Invalid Value");
    }else{

      int numberLength = getDigitCount(number);
      int reversed = reverse(number);
      int reversedLength = getDigitCount(number);

      if(numberLength != reversedLength){
        int leftZeros = numberLength - reversedLength;
        for(int i = 0; i <= leftZeros; i++){
          System.out.println("Zero");
        }
      }

      while(reversed > 0){
        int lastDigit = number % 10;

        switch (lastDigit){
          case 0:
            System.out.println("Zero");
            break;
          case 1:
            System.out.println("One");
            break;
          case 2:
            System.out.println("Two");
            break;
          case 3:
            System.out.println("Three");
            break;
          case 4:
            System.out.println("Four");
            break;
          case 5:
            System.out.println("Five");
            break;
          case 6:
            System.out.println("Six");
            break;
          case 7:
            System.out.println("Sevem");
            break;
          case 8:
            System.out.println("Eight");
            break;
          case 9:
            System.out.println("Nine");
            break;
        }
        reversed /= 10;
      }
    }
  }

  public static int reverse (int number){

    int reversedNumber = 0;
    while(Integer.toString(number).length() > 0){
      int lastDigit = number % 10;
      reversedNumber = reversedNumber * 10 + lastDigit;
      number /= 10;
    }

    return reversedNumber;
  }

  public static int getDigitCount (int number) {

    if(number < 0) return -1;
    return Integer.toString(number).length();
  }
}
