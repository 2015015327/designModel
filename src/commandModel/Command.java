package commandModel;


/*
 * 命令模式基本命令类
 * 定义命令执行者以及执行方法
 * */
public abstract class Command {
	public Reciever reciver;

	public Command(Reciever reciver) {
		this.reciver = reciver;
	}
	public abstract void excute();
}
