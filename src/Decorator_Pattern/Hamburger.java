package Decorator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Hamburger extends Meal{
	
	private List<Meal> mealList;
	
	public Hamburger(){
		this.mealList = new ArrayList<>();
	}
	
	public Hamburger(Meal meal){
		this.mealList = new ArrayList<>();
		this.mealList.add(meal);
	}
	
	public Hamburger(List<Meal> mealList){
		this.mealList = mealList;
	}

	@Override
	public String getMessage() {
		String message = "Hamburger";
		
		for(Meal meal : this.mealList){
			message += " plus " + meal.getMessage();
		}
		
		return message;
	}

	@Override
	public double getPrice() {
		double price = 25.0;
		
		for(Meal meal : this.mealList){
			price += meal.getPrice();
		}
		
		return price;
	}

}
