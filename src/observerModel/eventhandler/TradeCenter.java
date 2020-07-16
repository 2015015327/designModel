package observerModel.eventhandler;


public class TradeCenter {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setName("уе");
		Student studenta = new Student();
		studenta.setName("a");
		Student studentb= new Student();
		studentb.setName("b");
		teacher.addListeners(studenta,"goClass");
		teacher.addListeners(studentb,"goClass");
		try {
			teacher.GoToClass();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}