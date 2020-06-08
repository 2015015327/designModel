package Decorate;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生成被包装类
		ConcreteComponent a = new ConcreteComponent();
		//生成包装类 b
		ConcreteDecoratorA b = new ConcreteDecoratorA();
		//生成包装器类c
		CocreteDecoratorB c = new  CocreteDecoratorB();
		//使用b包装a
		b.setC(a);
		//使用c包装b
		c.setC(b);
		//执行操作
		c.operation();
	}

}
