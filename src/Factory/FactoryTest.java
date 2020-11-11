package Factory;

public class FactoryTest {
	public static void main(String args[])
	{
		FactoryDemo demo = new FactoryDemo();
		Shape shape = demo.getShape("circle");
		System.out.println(shape.getShape());
		
		Shape sp = demo.getShape("square");
		System.out.println(sp.getShape());
	}

}
