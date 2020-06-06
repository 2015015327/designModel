package Decorate;

public class ConcreteComponent extends component {
	String name;
	
	@Override
	public void operation() {
		System.out.println("具体对象操作");
	}

}
