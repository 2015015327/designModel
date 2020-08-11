package java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/*
 * java ������ù��캯��
 * */
public class JavaReflectConstructClass {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String a ="111111";
		//1.���class��
		Class test = reflectTestClass.class;
		//2��ù��캯��
		Constructor constructors[] = test.getConstructors();
		Constructor constructors2[] = test.getDeclaredConstructors();
		//3.���ù��캯������ʵ����
		reflectTestClass name = (reflectTestClass)test.newInstance();
		for(int i = 0 ; i < constructors2.length ; i++){
			reflectTestClass temp = (reflectTestClass)constructors2[i].newInstance(i,i+1);
			temp.show();
		}
	}
}
