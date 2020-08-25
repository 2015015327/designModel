package IteratorModel;

import java.util.ArrayList;

public class ConcreateAggrate extends AbstractAggrate{
	private ArrayList<Object> items = new ArrayList<Object>();
	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ConcreateIterator(this);
	}
	public int count(){
		return items.size();
	}
	public Object getListObject(int index){
		return this.items.get(index);
	}
	public void setListObject(int index,Object value){
		this.items.set(index, value);
	}
	public void add(Object object){
		this.items.add(object);
	}
}
