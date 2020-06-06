package Decorate;

public class CocreteDecoratorB extends Decorator{
	public void operation(){
		System.out.println("B操作");
		c.operation();
	}
}

