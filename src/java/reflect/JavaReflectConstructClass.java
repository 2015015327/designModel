package java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/*
 * java ������ù��캯��
 * */
public class JavaReflectConstructClass {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		String a ="111111";
		//1.���class��
		Class test = reflectTestClass.class;
		//2��ù��캯��
		Constructor constructor = test.getConstructor();
		Constructor constructor2 = test.getDeclaredConstructor();
		//3.���ù��캯������ʵ����
		reflectTestClass name1 = (reflectTestClass)test.newInstance();
		reflectTestClass name2 = (reflectTestClass)constructor.newInstance();
		reflectTestClass name3 = (reflectTestClass)constructor2.newInstance();
		System.out.println(1==1||1==2&&1==2);
	}
}
