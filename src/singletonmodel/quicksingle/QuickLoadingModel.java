package singletonmodel.quicksingle;
//����ģʽ������ʽ(��ʼ����ʼ��)
public class QuickLoadingModel {
    private static QuickLoadingModel test = new QuickLoadingModel();  
    private QuickLoadingModel (){}  
    public static QuickLoadingModel getInstance() {  
    	return test;  
    }  
}
