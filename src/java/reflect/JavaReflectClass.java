package java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//java反射 Class
//一个类有什么？
/*
 * 1.位置&名称
 * 2.属性名称及属性类型
 * 3.方法
 * */
public class JavaReflectClass {

	public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//1.java通过反射获得java类的位置和名称
		reflectTestClass test = new reflectTestClass();
		Class a = reflectTestClass.class;
		String className=a.getName();
		//2.java通过反射获得属性名称以及属性类型
		Field files[]=a.getFields();
		//3.java通过反射获得类中的方法
		Method shows[] = a.getMethods();
		//----------------------------------------------------
		//效果展示与方法调用
		System.out.println(className);
		for(int i= 0 ; i < files.length ; i++){
			System.out.println("filename:"+files[i].getName()+" fileType:"+files[i].getType().getName());
		}
		//方法调用
		for(int i = 0 ; i < shows.length ; i++){
			shows[i].invoke(test,null);
		}
	}
}
