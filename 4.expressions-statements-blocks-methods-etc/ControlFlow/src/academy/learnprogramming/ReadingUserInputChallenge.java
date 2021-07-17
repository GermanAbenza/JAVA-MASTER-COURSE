package academy.learnprogramming;

import java.util.Scanner;

public class ReadingUserInputChallenge {

  public static void sumInputNumbers(){

    Scanner scanner = new Scanner(System.in);
    int validNumbers = 0;
    int sum = 0;

    while (validNumbers < 10){
      System.out.println("Enter number #" + (validNumbers+1));

      boolean isValidNumber = scanner.hasNextInt();
      if(isValidNumber){
        int number = scanner.nextInt();
        validNumbers ++;
        sum += number;
      }else{
        System.out.println("Invalid number");
      }
      scanner.nextLine();
    }
    System.out.println(sum);
    scanner.close();
  }
}
