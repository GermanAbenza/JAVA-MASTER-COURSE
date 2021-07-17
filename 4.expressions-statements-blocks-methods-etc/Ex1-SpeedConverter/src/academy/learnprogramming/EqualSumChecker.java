package academy.learnprogramming;

public class EqualSumChecker {
  public static boolean hasEqualSum(int operandA, int operandB, int expectedSolution){
    int solution = operandA + operandB;
    return solution - expectedSolution == 0;
  }
}
