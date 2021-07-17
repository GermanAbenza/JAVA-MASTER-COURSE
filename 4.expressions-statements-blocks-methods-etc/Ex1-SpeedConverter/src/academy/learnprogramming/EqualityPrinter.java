package academy.learnprogramming;

public class EqualityPrinter {
  public static void printEqual(int valueA, int valueB, int valueC){
    if(
        valueA < 0
          || valueB < 0
          || valueC < 0
    ){
      System.out.println("Invalid Value");
    }else{
      String response = valueA == valueB && valueB == valueC ? "All numbers are equal"
        : valueA != valueB && valueB != valueC && valueC != valueA ? "All numbers are different"
        : "Neither all are equal or different";

      System.out.println(response);
    }
  }
}
