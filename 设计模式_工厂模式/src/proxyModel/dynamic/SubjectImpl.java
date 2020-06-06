package proxyModel.dynamic;

public class SubjectImpl implements Subject{

	public PsnMessage person;
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("name:"+person.getName()+"/ncode:"+person.getCode());
	}

	public Object createData(String name, String code) {
		this.person=new PsnMessage();
		person.setCode(code);
		person.setName(name);
		return person;
	}

}
