package exercise.ex;

public class NestedClassExample {

	public static void main(String[] args) {
		Car c = new Car();
        Car.Tire t = c.new Tire();
        Car.Engine e = new Car.Engine();
	}

}
