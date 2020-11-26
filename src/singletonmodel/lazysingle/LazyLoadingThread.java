package singletonmodel.lazysingle;
//单例模式，懒汉模式（通过加锁实现线程安全）
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
