package adapterModel;
//ÊÊÅäÆ÷Àà
public class Adapter implements TargetImpl{
	Adaptee adaptee = new Adaptee();
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println(adaptee.show());
	}

}
