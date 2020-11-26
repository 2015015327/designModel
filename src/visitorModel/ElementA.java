package visitorModel;

public class ElementA extends Element{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitorElementA(this);
	}

}
