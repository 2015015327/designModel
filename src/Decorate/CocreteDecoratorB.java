package Decorate;

public class CocreteDecoratorB extends Decorator{
	public void operation(){
		System.out.println("使用CocreteDecoratorB包装ConcreteDecoratorA对象");
		c.operation();
	}
}

