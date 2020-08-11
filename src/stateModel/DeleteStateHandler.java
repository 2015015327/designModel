package stateModel;

public class DeleteStateHandler implements statehandler{
	String statename = "É¾³ý";
	@Override
	public void handler(Context context) {
		// TODO Auto-generated method stub
		context.setState(new NewState());
	}

}
