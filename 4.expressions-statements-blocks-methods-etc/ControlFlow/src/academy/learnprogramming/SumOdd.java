package academy.learnprogramming;

public class SumOdd {

  public static boolean isOdd (int number) {
    return (number > 0 && number % 2 != 0);
  }

  public static int sumOdd (int valueA, int valueB) {
    if (!(valueA > 0) || !(valueB > 0)) return -1;
    int upperLimit = Math.max(valueA, valueB);
    int lowerLimit = upperLimit == valueA ? valueB : valueB;

    int sum = 0;
    for(int i = lowerLimit; i <= upperLimit; i++){
      if(isOdd(i)) sum += i;
    }

    return sum;
  }
}
