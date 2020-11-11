package decorator;
import decorator.FlowerBouque;
public class TestDecorator {

	public static void main(String args[])
	{
		FlowerBouque Rose = new RoseBouque();
		FlowerBouque Decorator = new Glitter(Rose);
		System.out.println(Rose.getDescription()+" with "+Decorator.getDescription());
		System.out.println(""+Decorator.cost());
	}

	
}
