package academy.learnprogramming;

public class Point {
  private int x;
  private int y;

  public Point () {

  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double distance(){
    return Math.sqrt(this.y * this.y + this.x * this.x);
  }

  public double distance(int x, int y){
    int diffX = this.x >= x ? this.x - x : x - this.x;
    int diffY = this.y >= x ? this.y - y : y - this.y;
    return Math.sqrt(diffX * diffX + diffY * diffY);
  }

  public double distance(Point point){
    int x = point.getX();
    int y = point.getY();

    int diffX = this.x >= x ? this.x - x : x - this.x;
    int diffY = this.y >= x ? this.y - y : y - this.y;
    return Math.sqrt(diffX * diffX + diffY * diffY);
  }
}
