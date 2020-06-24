package buildermodel;

//指挥者类，控制建造过程
public class Director {
	public void builder(BuilderItf builder){
		System.out.println(builder.getMessage());
	}
}
