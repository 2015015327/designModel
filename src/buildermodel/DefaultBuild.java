package buildermodel;


//建造方式1：默认建造方式，建造方式通过继承建造接口来实现
public class DefaultBuild implements BuilderItf{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "this is defult builder";
	}

}
