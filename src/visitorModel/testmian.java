package visitorModel;

public class testmian {
	
	public static void main(String args[]){
		ElmentCollection elements = new ElmentCollection();
		VisitorA a = new VisitorA();
		VisitorB b= new VisitorB();
		elements.accept(a);
		elements.accept(b);
	}
}
