package academy.learnprogramming;

public class Mitsubishi extends Car{

  public Mitsubishi(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public void startEngine() {
    System.out.println("Engine has been started from class Mitsubishi");;
  }

  @Override
  public void accelerate() {
    System.out.println("car is accelerating from class Mitsubishi");
  }

  @Override
  public void brake() {
    System.out.println("car is braking from class Mitsubishi");
  }
}
