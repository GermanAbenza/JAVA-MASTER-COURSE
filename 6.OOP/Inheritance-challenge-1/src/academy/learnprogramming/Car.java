package academy.learnprogramming;

public class Car extends Vehicle{

  private String brand;
  private String model;
  private String color;

  public Car(int wheels, String brand, String model, String color) {
    super(4, true, true, true);
    this.brand = brand;
    this.model = model;
    this.color = color;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void move() {
    System.out.println("Called move() from Car");
    super.move();
  }

  public void steer() {
    System.out.println("changing direction with steering wheel");
  }

  @Override
  public void setDirection() {
    steer();
    super.setDirection();
  }
}
