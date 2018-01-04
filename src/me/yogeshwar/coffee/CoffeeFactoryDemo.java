package me.yogeshwar.coffee;

public class CoffeeFactoryDemo {

	public static void main(String[] args) {
		Coffee coffee1 = CoffeeFactory.getCoffee("A");
		coffee1.deliver();
		Coffee coffee2 = CoffeeFactory.getCoffee("B");
		coffee2.deliver();
	}

}
