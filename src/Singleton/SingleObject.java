package Singleton;

public class SingleObject {

	private static SingleObject instance = new SingleObject();
	private SingleObject()
	{
		
	}
	
	public static SingleObject getInstnce()
	{
		return instance;
	}
	
	public void showMessage()
	{
		System.out.print("Hello World!");
	}
}
