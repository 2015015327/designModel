package compsiteModel;

//组合模式，
public abstract class Component {
	public String name;
	public int dept;
	Component(String name) {
		super();
		this.name = name;
		this.dept=1;
	}

	public abstract void add(Component addnode);
	public abstract void remove(Component removenode);
	public abstract void display();
}
