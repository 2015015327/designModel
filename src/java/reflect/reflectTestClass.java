package java.reflect;

public class reflectTestClass {
	String name;
	String code;
	public reflectTestClass(){
		this.name = "aaa";
		this.code = "001";
	}
	public reflectTestClass(String name,String code){
		this.name=name;
		this.code=code;
	}
	public void show(){
		System.out.println("code:"+this.code);
		System.out.println("name"+this.name);
	}
}
