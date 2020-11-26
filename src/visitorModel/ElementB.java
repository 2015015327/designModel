package visitorModel;

public class ElementB extends Element{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitorElementB(this);
	}

}
