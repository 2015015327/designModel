package Decorate;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteComponent a = new ConcreteComponent();
		ConcreteDecoratorA b = new ConcreteDecoratorA();
		CocreteDecoratorB c = new  CocreteDecoratorB();
		b.setC(a);
		c.setC(b);
		c.operation();
	}

}
