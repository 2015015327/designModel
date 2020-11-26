package FlyweightModel;

public class testmain {
	public static void main(String args[]){
		String message = "testmainclass";
		FlyweightFactory factory = new FlyweightFactory();
		factory.GetFlyWeight("A").Operation(message);
		factory.GetFlyWeight("B").Operation(message);
		factory.GetFlyWeight("C").Operation(message);
		factory.GetUnShareFlyWeight("test").Operation(message);
	}
}
