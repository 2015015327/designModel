package Decorate;

public class ConcreteDecoratorA extends Decorator{
	public void operation(){
		System.out.println("使用ConcreteDecoratorA包装ConcreteComponent对象");
		c.operation();
	}
}
