package commandModel;

import java.util.ArrayList;

/*
 * ����ģʽ
 * invoker�����ִ����
 * 1.����洢��Ҫִ������
 * 2.ִ����Ӧ����
 * 3.�����Ӧ��־
 * */
public class Invoker {
	private ArrayList<Command> command = new ArrayList<Command>();
	public void addCommand(Command a){
		this.command.add(a);
	}
	public void cancelCommand(Command a){
		this.command.remove(a);
	}
	public void excute(){
		for(Command test : command){
			test.excute();
		}
	}
}
