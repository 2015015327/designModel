package Decorate;

public class ConcreteDecoratorA extends Decorator{
	public void operation(){
		System.out.println("A操作 ");
		c.operation();
	}
}
