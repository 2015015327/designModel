package Decorate;

public class Decorator extends component{
	protected component c;
	
	public component getC() {
		return c;
	}

	public void setC(component c) {
		this.c = c;
	}

	public void operation() {
		// TODO Auto-generated method stub
		 if(c!=null){
			 c.operation();
		 }
	}

}
