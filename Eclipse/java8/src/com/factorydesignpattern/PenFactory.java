package com.factorydesignpattern;

public class PenFactory 
{
	public Pen getInstances(String str)
	{
		if(str.equals("premium"))
		{
			return new Parker();
		}
		else if(str.equals("gel"))
		{
			return new Reynold();
		}
		else
		{
			return new Lexi();
		}
	}
}
