package visitorModel;

/*
 * 访问者模式
 * 访问者类
 * 特点：分离对象的数据结构与业务处理
 * 缺点：拓展性差，如果新增一个element则需要重新处理
 * */
public abstract class Visitor {
	 //访问A元素结构处理
	 public abstract void visitorElementA(ElementA a);
	 //访问B元素结构处理
	 public abstract void visitorElementB(ElementB b);
}
