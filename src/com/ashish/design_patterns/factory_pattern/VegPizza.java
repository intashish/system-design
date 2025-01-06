package com.ashish.design_patterns.factory_pattern;

public class VegPizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("Preparing VEG PIZZA");
		
	}

	@Override
	public void bake() {
		System.out.println("Baking VEG PIZZA");
		
	}

	@Override
	public void cut() {
		System.out.println("Cutting VEG PIZZA");
		
	}

}
