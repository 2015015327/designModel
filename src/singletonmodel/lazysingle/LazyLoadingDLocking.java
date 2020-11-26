package singletonmodel.lazysingle;
//单例模式 双检锁/双重校验锁
//效率高，线程安全
public class LazyLoadingDLocking {
	private volatile static LazyLoadingDLocking test;

	private LazyLoadingDLocking() {
	}

	public static LazyLoadingDLocking getInstance() {
		if (test == null) {
			synchronized (LazyLoadingDLocking.class) {
				if (test == null) {
					test = new LazyLoadingDLocking();
				}
			}
		}
		return test;
	}
}
