package brigeModel;
/*
 * 
 * 桥接模式
 * 将方法的具体实现与抽象，以及调用部分进行分离，方便对具体实现进行扩展
 * AbstractDoOperate 桥接
 * */
public class AbstractDoOperate {
	protected SoftImpl impl;
	public void setSoftImpl(SoftImpl impl){
		this.impl=impl;
	}
	public void doOperate(){
		impl.operate();
	}
}
