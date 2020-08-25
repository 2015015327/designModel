package compsiteModel;

//组合模式叶子节点，不允许有子节点
public class Leaf extends Component{

	Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.dept+"-"+this.name);
	}

	@Override
	public void add(Component addnode) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void remove(Component removenode) {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove to a leaf");
	}

}
