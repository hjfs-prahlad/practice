package com.day1;
interface WFirst
{
	void display();
//	void show();
}

public class WithLambda
{

	public static void main(String[] args) 
	{
		new WFirst()  {public void display() {System.out.println("inside display"); } ;}.display();
	}

}
