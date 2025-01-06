package com.ashish.design_patterns.factory_pattern;

public class PizzaStore {

	public static void main(String[] args) {
		
		//make Pizza factory a singleton class
		//made the pizza creation part as static
		Pizza vegPizza = PizzFactory.getInst("vegPizza");
		
		Pizza chickenPizza = PizzFactory.getInst("chickenPizza");
		
		chickenPizza.bake();
		vegPizza.bake();
	}
}
