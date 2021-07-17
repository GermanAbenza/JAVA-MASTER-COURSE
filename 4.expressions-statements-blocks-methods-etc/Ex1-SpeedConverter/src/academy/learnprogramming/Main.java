package academy.learnprogramming;

public class Main  {

  public static void main (String[] args){
    System.out.println(area(-3690));
  }

  public static double area (double radius) {
    if (radius < 0) return -1;

    return radius * radius * Math.PI;
  }

  public static double area (double sideA, double sideB) {
    if(sideA < 0 || sideB < 0) return -1.0;

    return sideA * sideB;
  }
}

