package commandModel;

public class ActionB extends Command{

	public ActionB(Reciever reciver) {
		super(reciver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		reciver.doActionB();
	}

}
