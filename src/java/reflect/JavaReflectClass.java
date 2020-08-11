package java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//java���� Class
//һ������ʲô��
/*
 * 1.λ��&����
 * 2.�������Ƽ���������
 * 3.����
 * */
public class JavaReflectClass {

	public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//1.javaͨ��������java���λ�ú�����
		reflectTestClass test = new reflectTestClass();
		Class a = reflectTestClass.class;
		String className=a.getName();
		//2.javaͨ�����������������Լ���������
		Field files[]=a.getFields();
		//3.javaͨ�����������еķ���
		Method shows[] = a.getMethods();
		//----------------------------------------------------
		//Ч��չʾ�뷽������
		System.out.println(className);
		for(int i= 0 ; i < files.length ; i++){
			System.out.println("filename:"+files[i].getName()+" fileType:"+files[i].getType().getName());
		}
		//��������
		for(int i = 0 ; i < shows.length ; i++){
			shows[i].invoke(test,null);
		}
	}
}
