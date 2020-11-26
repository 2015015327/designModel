package commandModel;

import java.util.ArrayList;

/*
 * 命令模式
 * invoker命令的执行者
 * 1.负责存储需要执行命令
 * 2.执行相应命令
 * 3.输出相应日志
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
