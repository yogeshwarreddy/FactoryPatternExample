package me.yogeshwar.coffee;

public abstract class Coffee {
	public void serveCoffee() {
		System.out.println("Serving Coffee");
	}
	public abstract void makeCoffee();
	
	public void deliver() {
		makeCoffee();
		serveCoffee();
		System.out.println("Delivered coffee");
	}
}
