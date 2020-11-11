package decorator;
import decorator.Decorator;
public class Glitter extends Decorator {

	 FlowerBouque fb;
	 Glitter(FlowerBouque fb)
	 {
		 this.fb = fb;
	 }

	public String getDescription()
	{
		return "glitter Decoration";
	}
	
	public double cost()
	{
		return 5+fb.cost();
	}
	
}
