package me.yogeshwar.coffee;

public class CoffeeFactory {
	public static Coffee getCoffee(String option) {
		switch (option) {
		case "A":
			return new Capuccino();
		case "B":
			return new Mocha();
		default:
			return null;
		}
	}
}
