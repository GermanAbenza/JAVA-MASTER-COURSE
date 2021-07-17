package academy.learnprogramming;

public class MinutesToYearsAndDaysCalculator {

  public static void printYearsAndDays (long minutes) {

    if (minutes < 0){
      System.out.println("Invalid Value");
    }else{
      long days = minutes / (60 * 24);
      int years = (int) (days / 365);
      int remainingDays = (int) (days % 365);
      int remainingMinutes = (int) (minutes % (60 * 24));

      System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
  }
}
