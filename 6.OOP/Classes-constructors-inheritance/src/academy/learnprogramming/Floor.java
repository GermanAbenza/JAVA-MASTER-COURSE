package academy.learnprogramming;

public class Floor {

  private double length;
  private double width;

  public Floor(double length, double width) {
    this.length = Math.max(0, length);
    this.width = Math.max(0, width);
  }

  public double getArea() {
    return this.width * this.length;
  }

}
