package academy.learnprogramming;

public class Main {

  public static void main(String[] args) {
    System.out.println("executing the main method");

    int highScore = calculateScore(true, 800, 5, 100);
    System.out.println(highScore);

    highScore = calculateScore(true, 10000, 8, 200);
    System.out.println(highScore);

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim", highScorePosition);
  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if(gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
      return finalScore;

    }else return -1;
  }

  public static void displayHighScorePosition (String player, int position){
    System.out.println(player + " managed to get into position " + position + " on the high score table");
  }

  public static int calculateHighScorePosition (int score) {

//    if (score >= 1000){
//      return 1;
//    }else if (score >= 500 && score < 1000){ ===> second expression should not be evaluated as it will always be true
//      return 2;
//    }else if (score >= 100 && score < 500){ ===> second expression should not be evaluated as it will always be true
//      return 3;
//    }else{
//      return 4;
//    }
    return score >= 1000 ? 1
        : score >= 500 ? 2
        : score >= 100 ? 3
        : 4;
  }
}
