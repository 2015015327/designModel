package HandlerModel;

public class ConcreateHandler2 extends Handler{

	@Override
	public void HandlerRequest(int request) {
		// TODO Auto-generated method stub
		if(request>10 && request<100){
			System.out.println(this.getClass().getName()+":"+String.valueOf(request));
		}else{
			this.handler.HandlerRequest(request);
		}
	}

}
