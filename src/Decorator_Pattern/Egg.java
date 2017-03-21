package Decorator_Pattern;

public class Egg extends Decorator{

	public Egg(Meal meal) {
		super(meal);
	}

	@Override
	public String getMessage() {
		if(super.meal == null){
			return "Egg";
		}
		return super.meal.getMessage() + " | " + "Egg";
	}

	@Override
	public double getPrice() {
		if(super.meal == null){
			return 10.0;
		}
		return super.meal.getPrice() + 10.0;
	}

}
