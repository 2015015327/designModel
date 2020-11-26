package singletonmodel.lazysingle;
//����ģʽ ˫����/˫��У����
//Ч�ʸߣ��̰߳�ȫ
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
