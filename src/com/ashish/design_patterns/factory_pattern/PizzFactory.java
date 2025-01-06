package com.ashish.design_patterns.factory_pattern;

public class PizzFactory {

	public static Pizza pizza;
	
	public static Pizza getInst(String type) {
		if(type == "cheesePizza") {
			pizza = new CheesePizza();
		}else if(type == "chickenPizza") {
			pizza = new ChickenPizza();
		}else if( type == "vegPizza") {
			pizza = new VegPizza();
		}	
		return pizza;
	}
}
