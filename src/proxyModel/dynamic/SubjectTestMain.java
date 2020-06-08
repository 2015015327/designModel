package proxyModel.dynamic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class SubjectTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		Class<?> proxyClass = Proxy.getProxyClass(
//				SubjectProxy.class.getClassLoader(), Subject.class);
//		final Constructor<?> cons = proxyClass.getConstructor(InvocationHandler.class);
//		final InvocationHandler ih = new SubjectProxy(new SubjectImpl());
//		SubjectImpl helloWorld = (SubjectImpl) cons.newInstance(ih);
//		helloWorld.message();
	}
}
