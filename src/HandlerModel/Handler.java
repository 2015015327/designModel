package HandlerModel;


/*
 * ְ�������ģʽ
 * 
 * */
public abstract class Handler {
	protected Handler handler;
	//������һ������
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	public abstract void HandlerRequest(int request);
}
