package buildermodel;

public class testmain {
	public static void main(String args[]){
		DefaultBuild builder = new DefaultBuild();
		Director director = new Director();
		director.builder(builder);
	}
}
