package HandlerModel;

public class ConcreateHandler3 extends Handler{

	@Override
	public void HandlerRequest(int request) {
		// TODO Auto-generated method stub
		if(request<200 && request>100){
			System.out.println(this.getClass().getName()+":"+String.valueOf(request));
		}else{
			System.out.println("default:"+String.valueOf(request));
		}
	}

}
