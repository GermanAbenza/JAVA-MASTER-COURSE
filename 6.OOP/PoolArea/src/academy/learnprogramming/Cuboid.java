package academy.learnprogramming;

public class Cuboid extends Rectangle {

  private double height;

  public Cuboid(double width, double length, double height){
    super(width, length);
    this.height = Math.max(0, height);
  }

  public double getHeight(){
    return this.height;
  }

  public double getVolume() {
    return super.getArea() * height;
  }
}
