package singletonmodel.quicksingle;
//单例模式，饿汉式(开始即初始化)
public class QuickLoadingModel {
    private static QuickLoadingModel test = new QuickLoadingModel();  
    private QuickLoadingModel (){}  
    public static QuickLoadingModel getInstance() {  
    	return test;  
    }  
}
