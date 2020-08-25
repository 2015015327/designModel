package compsiteModel;

import java.util.ArrayList;

//组合模式，枝节点
public class Compsite extends Component{

	Compsite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Component> children = new ArrayList<Component>();

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("depth:"+this.dept+"    name:"+this.name);
		for(int i = 0 ; i < children.size() ; i++){
			children.get(i).dept=this.dept+1;
			children.get(i).display();
		}
	}

	@Override
	public void add(Component addnode) {
		// TODO Auto-generated method stub
		this.children.add(addnode);
		
	}
	@Override
	public void remove(Component removenode) {
		// TODO Auto-generated method stub
		this.children.remove(removenode);
	}

}
