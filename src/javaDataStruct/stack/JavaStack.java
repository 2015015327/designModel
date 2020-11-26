package javaDataStruct.stack;

import java.util.ArrayList;

//javaջ���ݽṹʵ��,ջ
public class JavaStack<T> {
	//��¼ջ��Ԫ��λ��
	private int top = -1;
	//��ʼ��ջ
	private ArrayList<T> stack = new ArrayList<T>();
	//��ջ
	public boolean push(T data){
		stack.add(data);
		top++;
		return true;
	} 
	//��ջ
	public T pop() throws Exception{
		if(top==-1){
			throw new Exception("ջ�գ��޷���ջ");
		}
		T data = stack.get(top);
		stack.remove(top);
		top--;
		return data;
	}
	//�鿴ջ����
	public int length(){
		return top+1;
	}
}
