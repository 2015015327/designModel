package commandModel;


/*
 * ����ģʽ����������
 * ��������ִ�����Լ�ִ�з���
 * */
public abstract class Command {
	public Reciever reciver;

	public Command(Reciever reciver) {
		this.reciver = reciver;
	}
	public abstract void excute();
}
