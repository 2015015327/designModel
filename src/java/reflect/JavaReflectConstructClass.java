package java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/*
 * java 反射调用构造函数
 * */
public class JavaReflectConstructClass {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		String a ="111111";
		//1.获得class类
		Class test = reflectTestClass.class;
		//2获得构造函数
		Constructor constructor = test.getConstructor();
		Constructor constructor2 = test.getDeclaredConstructor();
		//3.调用构造函数进行实例化
		reflectTestClass name1 = (reflectTestClass)test.newInstance();
		reflectTestClass name2 = (reflectTestClass)constructor.newInstance();
		reflectTestClass name3 = (reflectTestClass)constructor2.newInstance();
		System.out.println(1==1||1==2&&1==2);
	}
}
