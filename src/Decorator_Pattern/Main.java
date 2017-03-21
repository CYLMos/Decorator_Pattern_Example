package Decorator_Pattern;

public class Main {

	public static void main(String[] args) {
		Meal hamburger = new Hamburger();
		hamburger = new FiftyPercent(hamburger);
		
		System.out.println("Message : " + hamburger.getMessage());
		System.out.println("Price : " + hamburger.getPrice());
		
		System.out.println("----------------------------------");

		Meal hamburger_egg = new Hamburger();
		hamburger_egg = new Egg(hamburger_egg);
		hamburger_egg = new FiftyPercent(hamburger_egg);

		System.out.println("Message : " + hamburger_egg.getMessage());
		System.out.println("Price : " + hamburger_egg.getPrice());
		
		System.out.println("----------------------------------");
		
		Meal Egg = new Egg(null);
		
		System.out.println("Message : " + Egg.getMessage());
		System.out.println("Price : " + Egg.getPrice());
		
		Egg = new FiftyPercent(Egg);
		
		System.out.println("----------------------------------");
		
		System.out.println("Message : " + Egg.getMessage());
		System.out.println("Price : " + Egg.getPrice());
		
	}

}
