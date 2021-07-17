package academy.learnprogramming;

public class Vehicle {

  private int wheels;
  private boolean steeringWheel;
  private boolean gears;
  private boolean engine;

  public Vehicle(int wheels, boolean steeringWheel, boolean gears, boolean engine) {
    this.wheels = wheels;
    this.steeringWheel = steeringWheel;
    this.gears = gears;
    this.engine = engine;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public void move() {
    System.out.println("called move() from Vehicle");
  }

  public void setDirection () {
    System.out.println("Setting direction from Vehicle");
  }
}
