package visitorModel;

//�����߾���ҵ������ҵ����֧����չ
public class VisitorA extends Visitor{

	@Override
	public void visitorElementA(ElementA a) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+"��"+a.getClass().getName()+"����");
	}

	@Override
	public void visitorElementB(ElementB b) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+"��"+b.getClass().getName()+"����");
	}

}
