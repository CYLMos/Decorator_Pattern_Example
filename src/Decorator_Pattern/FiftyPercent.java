package Decorator_Pattern;

public class FiftyPercent extends Decorator{

	public FiftyPercent(Meal meal) {
		super(meal);
	}

	@Override
	public String getMessage() {
		return super.meal.getMessage() + " | " + "50%";
	}

	@Override
	public double getPrice() {
		return super.meal.getPrice() * 0.5;
	}

}
