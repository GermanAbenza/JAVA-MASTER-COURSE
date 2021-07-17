package academy.learnprogramming;

public class Ford extends Car{

  public Ford(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public void startEngine() {
    System.out.println("Engine has been started from class Ford");;
  }

  @Override
  public void accelerate() {
    System.out.println("car is accelerating from class Ford");
  }

  @Override
  public void brake() {
    System.out.println("car is braking from class Ford");
  }
}
