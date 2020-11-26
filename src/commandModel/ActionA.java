package commandModel;

public class ActionA extends Command{
	public ActionA(Reciever reciver){
		super(reciver);
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		reciver.doActionA();
	}
}
