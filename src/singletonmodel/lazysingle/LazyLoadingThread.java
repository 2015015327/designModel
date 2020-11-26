package singletonmodel.lazysingle;
//����ģʽ������ģʽ��ͨ������ʵ���̰߳�ȫ��
public class LazyLoadingThread {
    private static LazyLoadingThread instance;  
    private LazyLoadingThread (){}  
    public static synchronized LazyLoadingThread getInstance() {  
    if (instance == null) {  
        instance = new LazyLoadingThread();  
    }  
    return instance;  
    } 
}
