package javaDataStruct.stack;

import java.util.ArrayList;

//java栈数据结构实现,栈
public class JavaStack<T> {
	//记录栈顶元素位置
	private int top = -1;
	//初始化栈
	private ArrayList<T> stack = new ArrayList<T>();
	//入栈
	public boolean push(T data){
		stack.add(data);
		top++;
		return true;
	} 
	//出栈
	public T pop() throws Exception{
		if(top==-1){
			throw new Exception("栈空，无法出栈");
		}
		T data = stack.get(top);
		stack.remove(top);
		top--;
		return data;
	}
	//查看栈长度
	public int length(){
		return top+1;
	}
}
