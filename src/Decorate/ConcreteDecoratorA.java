package Decorate;

public class ConcreteDecoratorA extends Decorator{
	public void operation(){
		System.out.println("ʹ��ConcreteDecoratorA��װConcreteComponent����");
		c.operation();
	}
}
