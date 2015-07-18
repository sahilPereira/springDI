package com.test.springcore;

public class Restaurant {
	
	IHotDrink hotDrink;
	
	Restaurant(IHotDrink hotDrink)
	{
		this.hotDrink = hotDrink;
	}
	
	public void prepareHotDrink()
	{
		hotDrink.prepareHotDrink();
	}
}
