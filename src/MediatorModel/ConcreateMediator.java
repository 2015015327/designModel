package MediatorModel;

public class ConcreateMediator implements Mediator{

	public ConcreateColleague1 colleague1;
	public ConcreateColleague colleague;
	
	public ConcreateColleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(ConcreateColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public ConcreateColleague getColleague() {
		return colleague;
	}

	public void setColleague(ConcreateColleague colleague) {
		this.colleague = colleague;
	}

	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		//收到a消息转发给b
		if("MediatorModel.ConcreateColleague1".equals(colleague.getClass().getName())){
			this.colleague.Notify(message);
		}
		//收到b消息转发给a
		if("MediatorModel.ConcreateColleague".equals(colleague.getClass().getName())){
			colleague1.Notify(message);
		}
	}

}
