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
		System.out.println("学生"+name+"拿出了课本");
	}
	public void takePen(){
		System.out.println("学生"+name+"拿出了笔");
	}
	public void goClass(){
		this.takeBook();
		this.takePen();
	}
}
