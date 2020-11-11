package Adapter;
import Adapter.Animal;
public class BirdAdapter implements Animal {

	Bird bird;
	
	BirdAdapter(Bird bird)
	{
		this.bird = bird;
	}
	
	public String makeSound()
	{
		return bird.getSound();
	}
}
