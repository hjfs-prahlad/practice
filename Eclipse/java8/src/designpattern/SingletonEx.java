package designpattern;

public class SingletonEx
{
	// Single to n
		// Step 1: Create a private static variable of the class.
	private static final SingletonEx INSTANCE = new  SingletonEx();
		private String testVar = "original";
		//Create private constructor
		private SingletonEx()
		{
			
		}
		
		// having accessor to access instance
		
		public static SingletonEx getInstance()
		{
			return INSTANCE;
		}
		private void setTest(String pTest)
		{
			testVar = pTest;
		}
		private void test()
		{
			System.out.println(testVar);
		}
		
	
}
