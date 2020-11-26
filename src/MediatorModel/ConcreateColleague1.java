package MediatorModel;

public class ConcreateColleague1 extends Colleague{

	public ConcreateColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	public void sendMessage(String message){
		this.mediator.send(message, this);
	}
	public void Notify(String message){
		System.out.println(this.getClass().getName()+"得到信息"+message);
	}
}
