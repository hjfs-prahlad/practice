package com.factorydesignpattern;

public class PenMain {

	public static void main(String[] args) 
	{
		PenFactory pf = new PenFactory();
		Pen p = pf.getInstances("premium");
		p.penType();
		
	}

}
