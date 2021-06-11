package com.sgtesting.iopackage;

import java.io.Serializable;

public class Cars implements Serializable {
	private static final long serialVersionUID = 1L;

	public void showName(String name)
	{
		System.out.println("The name of The Car is :"+name);
	}

	public void price(int price)
	{
		System.out.println("The Price of the car is :"+price);
	}

	public void average(String avg)
	{
		System.out.println("The Milage of The Car is:  "+avg);
	}

	public void showColour(String colour)
	{
		System.out.println("the colour of the car is :"+colour);
	}
}


