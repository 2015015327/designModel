package MediatorModel;

public class testmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreateMediator mediator = new ConcreateMediator();
		ConcreateColleague c= new ConcreateColleague(mediator);
		ConcreateColleague1 c1 = new ConcreateColleague1(mediator);
		mediator.setColleague(c);
		mediator.setColleague1(c1);
		c.sendMessage("a发出消息");
		c1.sendMessage("b发出消息");
	}

}
