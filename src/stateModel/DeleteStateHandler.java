package stateModel;

public class DeleteStateHandler implements statehandler{
	String statename = "ɾ��";
	@Override
	public void handler(Context context) {
		// TODO Auto-generated method stub
		context.setState(new NewState());
	}

}
