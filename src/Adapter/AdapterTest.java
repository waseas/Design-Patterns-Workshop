package Adapter;

public class AdapterTest {
public static void main(String args[])
{
	Bird bird = new Sparrow();
	System.out.println("sparrow sound from sparrow object "+bird.getSound());
	
	Animal animal = new Tiger();
	System.out.println("Animal sound from Tiger Object "+animal.makeSound());
	
	Animal animal2 = new BirdAdapter(bird);
	System.out.println("Getting bird sound with animal methond "+animal2.makeSound());
}
}
