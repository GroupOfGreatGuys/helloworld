package is.ru.helloworld;

public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello world!");
		World world = new World();
		System.out.println(world.greet());
	}
}
