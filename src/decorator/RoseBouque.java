package decorator;

import decorator.FlowerBouque;;
public class RoseBouque extends FlowerBouque {

	public String getDescription()
	{
		return "Rose Bouque";
	}
	public double cost() {
		return 10.5;
	}
}
