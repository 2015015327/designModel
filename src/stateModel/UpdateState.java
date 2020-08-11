package stateModel;

public class UpdateState implements statehandler{
	String statename = "ÐÞ¸Ä";
	@Override
	public void handler(Context context) {
		// TODO Auto-generated method stub
		context.setState(new DeleteStateHandler());
	}

}
