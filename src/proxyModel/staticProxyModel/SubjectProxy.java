package proxyModel.staticProxyModel;

public class SubjectProxy implements Subject{
	SubjectImpl subjectimpl = new SubjectImpl();
	public void message() {
		// TODO Auto-generated method stub
		subjectimpl.message();
	}

	public Object createData(String name, String code) {
		// TODO Auto-generated method stub
		return this.subjectimpl.createData(name, code);
	}

}
