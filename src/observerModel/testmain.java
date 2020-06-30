package observerModel;

public class testmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreateSubject subject = new ConcreateSubject();
		subject.addObserver(new ConcreateObserver("a",subject));
		subject.addObserver(new ConcreateObserver("b", subject));
		subject.addObserver(new ConcreateObserver("c", subject));
		subject.setState("add");
		subject.notifyObserver();
		subject.setState("modify");
		subject.notifyObserver();
		subject.setState("click");
		subject.notifyObserver();
	}

}
