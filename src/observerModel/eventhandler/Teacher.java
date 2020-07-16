package observerModel.eventhandler;


//被观察者类老师类,可以动态添加学生
public class Teacher extends DefaultDelegation {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void GoToClass(){
		System.out.println("老师"+name+"来上课了，请拿出教科书");
		try {
			notifyOthers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
