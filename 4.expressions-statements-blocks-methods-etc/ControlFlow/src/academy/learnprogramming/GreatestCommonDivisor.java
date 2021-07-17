package academy.learnprogramming;

public class GreatestCommonDivisor {

  public static int getGreatestCommonDivisor(int first, int second) {

    if (first < 10 || second < 10) return -1;
    int bigger = Math.max(first, second);
    int smaller = first == bigger ? second : first;
    int MCD = 1;

    for (int i = smaller; i >= 1; i--) {
      if (bigger % i == 0 && smaller % i == 0) {
        MCD = i;
        break;
      }
    }
    return MCD;
  }
}