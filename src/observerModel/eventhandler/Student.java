package observerModel.eventhandler;

public class Student {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void takeBook(){
		System.out.println("ѧ��"+name+"�ó��˿α�");
	}
	public void takePen(){
		System.out.println("ѧ��"+name+"�ó��˱�");
	}
	public void goClass(){
		this.takeBook();
		this.takePen();
	}
}
