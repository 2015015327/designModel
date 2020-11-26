package visitorModel;

import java.util.ArrayList;
//访问者模式容器
public class ElmentCollection {
	ArrayList<Element> array = new ArrayList<Element>();
	public ElmentCollection(){
		this.array.add(new ElementA());
		this.array.add(new ElementB());
	}
	public void accept(Visitor visitor){
		for(int i = 0 ; i < array.size() ; i++){
			array.get(i).accept(visitor);
		}
	}
}
