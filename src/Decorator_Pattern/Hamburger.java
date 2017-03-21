package Decorator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Hamburger extends Meal{	
	@Override
	public String getMessage() {
		return "Hamburger";
	}

	@Override
	public double getPrice() {
		return 25.0;
	}

}
