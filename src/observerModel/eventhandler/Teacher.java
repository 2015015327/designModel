package observerModel.eventhandler;


//���۲�������ʦ��,���Զ�̬���ѧ��
public class Teacher extends DefaultDelegation {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void GoToClass(){
		System.out.println("��ʦ"+name+"���Ͽ��ˣ����ó��̿���");
		try {
			notifyOthers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
