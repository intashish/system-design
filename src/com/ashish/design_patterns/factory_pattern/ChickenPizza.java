package com.ashish.design_patterns.factory_pattern;

public class ChickenPizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("Preparing CHICKEN PIZZA");
		
	}

	@Override
	public void bake() {
		System.out.println("Baking CHICKEN PIZZA");
		
	}

	@Override
	public void cut() {
		System.out.println("Cutting CHICKEN PIZZA");
		
	}

}
