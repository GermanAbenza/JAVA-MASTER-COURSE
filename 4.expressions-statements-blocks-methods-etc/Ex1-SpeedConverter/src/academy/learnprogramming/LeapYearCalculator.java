package academy.learnprogramming;

public class LeapYearCalculator {

  public static boolean isLeapYear (int year) {

    if(year < 1 || year > 9999) return false;

    boolean isDivBy4 = year % 4 == 0;
    boolean isDivBy100 = year % 100 == 0;
    boolean isDivBy400 = year % 400 == 0;

    return ((isDivBy4 && isDivBy100 && isDivBy400) || (isDivBy4 && !isDivBy100));
  }
}
