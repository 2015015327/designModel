package templateMethodModel;

//模板方法模式，将子类通用的操作抽象到父类，子类特有的业务放到子类
//适用于，通用操作较多，而子类除了通用操作也有自身特有的操作
public abstract class AbstractMethodTemplate {
	public void doOperation(){
		System.out.println("这个是模板方法操作 ："+getAnswer());
	}
	public abstract String getAnswer();
}
