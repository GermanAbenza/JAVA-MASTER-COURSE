package academy.learnprogramming;

public class SecondsAndMinutesChallenge {

  public static void getDurationString(int seconds, long minutes){
    if(!(seconds >= 0 && seconds <= 59) || !(minutes >= 0)){
      System.out.println("Invalid Value");
    }else{
      long hours = minutes / 60;
      int remainingMinutes = (int) minutes % 60;

      String formattedSeconds = seconds < 10 ? "0" + seconds + "s" : seconds + "s";
      String formattedMinutes = minutes < 10 ? "0" + minutes + "m" : minutes + "m";
      String formattedHours = hours < 10 ? "0" + hours + "h" : hours + "h";

      System.out.println(formattedHours + " " + formattedMinutes + " " + formattedSeconds);
    }
  }

  public static void getDurationString(long seconds) {
    if(!(seconds >= 0)){
      System.out.println("Invalid Value");
    }else{
      long hours = seconds / 3600;
      byte minutes = (byte) ((seconds % 3600) / 60);
      byte remainingSeconds = (byte) ((seconds % 3600) % 60);

      String formattedSeconds = remainingSeconds < 10 ? "0" + remainingSeconds + "s" : remainingSeconds + "s";
      String formattedMinutes = minutes < 10 ? "0" + minutes + "m" : minutes + "m";
      String formattedHours = hours < 10 ? "0" + hours + "h" : hours + "h";

      System.out.println(formattedHours + " " + formattedMinutes + " " + formattedSeconds);
    }
  }
}
