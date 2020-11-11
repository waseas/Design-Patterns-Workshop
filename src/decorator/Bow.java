package decorator;

import decorator.Decorator;
public class Bow extends Decorator {

	 FlowerBouque fb;
	 Bow(FlowerBouque fb)
	 {
		 this.fb = fb;
	 }
	public String getDescription()
	{
		return "Bow decoration";
	}
	
	public double cost()
	{
		return 5;
	}
	

}
