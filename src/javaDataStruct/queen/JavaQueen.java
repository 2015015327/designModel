package javaDataStruct.queen;

import java.util.ArrayList;

public class JavaQueen<T> {
	ArrayList<T> queen = new ArrayList<T>();
	int index=0;
	public void in(T input){
		queen.add(input);
		index++;
	}
	public T out(){
		if(!queen.isEmpty()){
			return queen.remove(0);
		}
		return null;
	}
	public int size(){
		return queen.size();
	}
}
