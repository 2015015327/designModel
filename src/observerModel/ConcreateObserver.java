package observerModel;

public class ConcreateObserver extends Observer{
	public String name;
	public String state;
	public ConcreateSubject subject;
	public String getName() {
		return name;
	}

	ConcreateObserver(String name, ConcreateSubject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public ConcreateSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreateSubject subject) {
		this.subject = subject;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.state=this.subject.getState();
		System.out.println("观察者"+this.name+"新状态是"+this.getState());
	}

}
