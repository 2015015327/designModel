package commandModel;

public class testmain {
	
	
	public static void main(String args[]){
		Invoker test = new Invoker();
		Reciever reciver = new Reciever();
		ActionA a= new ActionA(reciver);
		ActionB b =new ActionB(reciver);
		ActionC c = new ActionC(reciver);
		test.addCommand(a);
		test.addCommand(b);
		test.addCommand(c);
		test.excute();
		
	}
}
