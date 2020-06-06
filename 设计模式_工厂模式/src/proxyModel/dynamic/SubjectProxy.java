
package proxyModel.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxy implements InvocationHandler{
	private Subject subject;
	public SubjectProxy(Subject subject) {
	    this.subject = subject;
	}
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--------------begin-----------");
        Object invoke = method.invoke(subject, args);
        System.out.println("--------------end-------------");
        return invoke;
    }

}
