package academy.learnprogramming;

public class AllFactors {

  public static void printFactors (int number){

    if(number < 0){
      System.out.println("Invalid Value");
    }else{

      String factors = "";
      for(int i = 1; i <= number; i++){
        if(number % i == 0) System.out.println(i);
      }
    }
  }
}
