package Decorate;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ɱ���װ��
		ConcreteComponent a = new ConcreteComponent();
		//���ɰ�װ�� b
		ConcreteDecoratorA b = new ConcreteDecoratorA();
		//���ɰ�װ����c
		CocreteDecoratorB c = new  CocreteDecoratorB();
		//ʹ��b��װa
		b.setC(a);
		//ʹ��c��װb
		c.setC(b);
		//ִ�в���
		c.operation();
	}

}
