package HandlerModel;


/*
 * 职责链设计模式
 * 
 * */
public abstract class Handler {
	protected Handler handler;
	//设置下一级处理
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	public abstract void HandlerRequest(int request);
}
