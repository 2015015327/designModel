package visitorModel;
//访问者模式
//定义数据结构类
public abstract class Element {
	public abstract void accept(Visitor visitor);
}
