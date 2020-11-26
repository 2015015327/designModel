package HandlerModel;

public class testmain {
	public static void main(String args[]){
		Handler handler1 = new ConcreateHandler1();
		Handler handler2 = new ConcreateHandler2();
		Handler handler3 = new ConcreateHandler3();
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		for(int i = 0 ; i <= 200 ; i+=2){
			handler1.HandlerRequest(i);
		}
	}
}
