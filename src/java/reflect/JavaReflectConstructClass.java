package java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/*
 * java 反射调用构造函数
 * */
public class JavaReflectConstructClass {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String a ="111111";
		//1.获得class类
		Class test = reflectTestClass.class;
		//2获得构造函数
		Constructor constructors[] = test.getConstructors();
		Constructor constructors2[] = test.getDeclaredConstructors();
		//3.调用构造函数进行实例化
		reflectTestClass name = (reflectTestClass)test.newInstance();
		for(int i = 0 ; i < constructors2.length ; i++){
			reflectTestClass temp = (reflectTestClass)constructors2[i].newInstance(i,i+1);
			temp.show();
		}
	}
}
