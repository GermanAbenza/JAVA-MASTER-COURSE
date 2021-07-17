package academy.learnprogramming;

public class Holden extends Car{

  public Holden(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public void startEngine() {
    System.out.println("Engine has been started from class Holden");;
  }

  @Override
  public void accelerate() {
    System.out.println("car is accelerating from class Holden");
  }

  @Override
  public void brake() {
    System.out.println("car is braking from class Holden");
  }
}
