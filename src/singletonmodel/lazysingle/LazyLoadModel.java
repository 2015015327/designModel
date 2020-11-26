package singletonmodel.lazysingle;
//单例模式 ， 懒汉模式1（即需要才初始化）
//此代码为非线程安全
public class LazyLoadModel {
	private static LazyLoadModel test;
	private LazyLoadModel(){}
	public static LazyLoadModel getInstance() {
		if(test==null){
			test=new LazyLoadModel();
		}
		return test;
	}
}
