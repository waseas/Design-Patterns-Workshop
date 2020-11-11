package Factory;
import Factory.Circle;
import Factory.Square;
public class FactoryDemo {

	public Shape getShape(String shape)
	{
		if(shape.equals("circle"))
			return (Shape) new Circle();
		else
			return (Shape) new Square();
	}

}
