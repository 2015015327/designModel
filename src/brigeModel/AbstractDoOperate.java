package brigeModel;
/*
 * 
 * �Ž�ģʽ
 * �������ľ���ʵ��������Լ����ò��ֽ��з��룬����Ծ���ʵ�ֽ�����չ
 * AbstractDoOperate �Ž�
 * */
public class AbstractDoOperate {
	protected SoftImpl impl;
	public void setSoftImpl(SoftImpl impl){
		this.impl=impl;
	}
	public void doOperate(){
		impl.operate();
	}
}
