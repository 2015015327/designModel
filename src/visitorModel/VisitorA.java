package visitorModel;

//访问者具体业务处理，对业务处理支持拓展
public class VisitorA extends Visitor{

	@Override
	public void visitorElementA(ElementA a) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+"被"+a.getClass().getName()+"访问");
	}

	@Override
	public void visitorElementB(ElementB b) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+"被"+b.getClass().getName()+"访问");
	}

}
