package Decorator_Pattern;

public class Egg extends Meal{

	@Override
	public String getMessage() {
		return "Egg";
	}

	@Override
	public double getPrice() {
		return 10.0;
	}

}
