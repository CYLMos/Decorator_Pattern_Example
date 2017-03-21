package Decorator_Pattern;

public abstract class Decorator extends Meal{
	
	protected Meal meal;
	
	public Decorator(Meal meal){
		this.meal = meal;
	}

}
