package com.singleton;

class EagerIntialiazedSingleton1 
{
	private static final EagerIntialiazedSingleton1 INSTANCE = new EagerIntialiazedSingleton1();
	
	private EagerIntialiazedSingleton1()
	{
		
	}
	
	public static EagerIntialiazedSingleton1 getInstance()
	{
		return INSTANCE;
	}
//	void setTest(String str)
//	{
//		String p = str;
//	}
//	void Test()
//	{
//		System.out.println("Test "+p);
//	}
	
}
public class EagerIntialiazedSingleton
{
	public static void main(String[] args) 
	{
		EagerIntialiazedSingleton1 er1 = EagerIntialiazedSingleton1.getInstance();
		EagerIntialiazedSingleton1 er2 = EagerIntialiazedSingleton1.getInstance();
		System.out.println(er1);
		System.out.println(er2);
	}
}

