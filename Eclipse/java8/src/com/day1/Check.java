package com.day1;

public class Check {
	int i;
	void counter()
	{
		i++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c = new Check();
		for (int i = 0; i < 200; i++)
		{
			c.counter();
		}
		System.out.println(c.i);
	}

}
