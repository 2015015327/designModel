package singletonmodel.lazysingle;
//����ģʽ �� ����ģʽ1������Ҫ�ų�ʼ����
//�˴���Ϊ���̰߳�ȫ
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
