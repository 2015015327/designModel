package facademodel;
/*
 * 外观模式是将几个不同的类综合到一起并进行相关操作编辑
 * */
public class Facade {
	System1 system1;
	System2 system2;
	System3 system3;
	System4 system4;
	
	Facade() {
		this.system1=new System1();
		this.system2=new System2();
		this.system3=new System3();
		this.system4=new System4();
	}

	Facade(System1 system1, System2 system2, System3 system3,
			System4 system4) {
		super();
		this.system1 = system1;
		this.system2 = system2;
		this.system3 = system3;
		this.system4 = system4;
	}

	public void show(){
		System.out.println("this is show method----------");
		this.system1.methodOne();
		this.system2.methodTwo();
		this.system3.methodThree();
		this.system4.methodFour();
		System.out.println("this is show method----------");
	}
	public void operateOne(){
		System.out.println("this is operateOne method -------------");
		this.system1.methodOne();
		System.out.println("this is operateOne method -------------");
	}
}
