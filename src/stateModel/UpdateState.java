package stateModel;

public class UpdateState implements statehandler{
	String statename = "�޸�";
	@Override
	public void handler(Context context) {
		// TODO Auto-generated method stub
		context.setState(new DeleteStateHandler());
	}

}
