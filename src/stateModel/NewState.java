package stateModel;

public class NewState implements statehandler{
	String statename = "����";
	@Override
	public void handler(Context context) {
		// TODO Auto-generated method stub
		context.setState(new UpdateState());
	}

}
