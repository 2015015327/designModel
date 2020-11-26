package HandlerModel;

public class ConcreateHandler1 extends Handler{

	@Override
	public void HandlerRequest(int request) {
		// TODO Auto-generated method stub
		if(request>0 && request<10){
			System.out.println(this.getClass().getName()+":"+String.valueOf(request));
		}else{
			this.handler.HandlerRequest(request);
		}
	}

}
