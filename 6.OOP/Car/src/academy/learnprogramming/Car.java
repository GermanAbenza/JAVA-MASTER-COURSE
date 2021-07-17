package academy.learnprogramming;

public class Car {

  private boolean engine;
  private int cylinders;
  private String name;
  private int wheels;

  public Car( int cylinders, String name) {
    this.engine = true;
    this.cylinders = cylinders;
    this.name = name;
    this.wheels = 4;
  }

  public void startEngine() {
    System.out.println("Engine has been started from class Car");
  }

  public void accelerate() {
    System.out.println("car is accelerating from class Car");
  }

  public void brake() {
    System.out.println("car is braking from class Car");
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName(){
    return name;
  }

}
