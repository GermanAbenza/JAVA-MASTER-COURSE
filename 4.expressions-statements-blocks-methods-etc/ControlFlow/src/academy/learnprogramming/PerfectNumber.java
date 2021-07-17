package academy.learnprogramming;

public class PerfectNumber {

  public static boolean isPerfectNumber (int number){

    if(number < 1) return false;

    int sum = 0;
    for(int i = 1; i < number; i++){
      int add = number % i == 0 ? i : 0;
      sum += add;
    }
    return sum == number;
  }
}
