package Decorate;

public class CocreteDecoratorB extends Decorator{
	public void operation(){
		System.out.println("ʹ��CocreteDecoratorB��װConcreteDecoratorA����");
		c.operation();
	}
}

