package visitorModel;

/*
 * ������ģʽ
 * ��������
 * �ص㣺�����������ݽṹ��ҵ����
 * ȱ�㣺��չ�Բ�������һ��element����Ҫ���´���
 * */
public abstract class Visitor {
	 //����AԪ�ؽṹ����
	 public abstract void visitorElementA(ElementA a);
	 //����BԪ�ؽṹ����
	 public abstract void visitorElementB(ElementB b);
}
