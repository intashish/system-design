package com.ashish.design_patterns.factory_pattern;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing CHEESE PIZZA");

	}

	@Override
	public void bake() {
		System.out.println("Baking CHEESE PIZZA");

	}

	@Override
	public void cut() {
		System.out.println("Cutting CHEESE PIZZA");

	}

}
