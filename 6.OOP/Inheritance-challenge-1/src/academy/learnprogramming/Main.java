package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	      Vehicle vehicle = new Vehicle(6, false, false, true);
	      vehicle.move();

	      Car car = new Car(4, "renault", "clio", "blue");
	      car.setDirection();
	      car.move();

	      SuperCar superCar = new SuperCar("ferrari", "LaFerrari", "red");
	      superCar.move();
	      superCar.setDirection();
    }
}
