package commandModel;

public class ActionC extends Command{

	public ActionC(Reciever reciver) {
		super(reciver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		reciver.doActionC();
	}

}
