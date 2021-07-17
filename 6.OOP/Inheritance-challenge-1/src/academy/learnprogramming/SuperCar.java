package academy.learnprogramming;

public class SuperCar extends Car {

  private boolean sportMode;

  public SuperCar(String brand, String model, String color) {
    super(4, brand, model, color);
    this.sportMode = false;
  }

  public boolean isSportMode() {
    return sportMode;
  }

  public void setSportMode(boolean sportMode) {
    this.sportMode = sportMode;

    if(this.sportMode){
      System.out.println("Sport mode activated");
    }else{
      System.out.println("Sport mode deactivated");
    }
  }

  @Override
  public void move() {
    System.out.println("Called move() from SuperCar");
    setSportMode(true);
    super.move();
  }
}
