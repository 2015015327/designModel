package proxyModel.staticProxyModel;

import proxyModel.dynamic.PsnMessage;

public class SubjectImpl implements Subject{
	PsnMessage ps = null;
	public void message() {
		System.out.println("name:"+ps.getName()+"/t code:"+ps.getCode());
	}

	public Object createData(String name, String code) {
		// TODO Auto-generated method stub
		this.ps=new PsnMessage();
		this.ps.setCode(code);
		this.ps.setName(name);
		return ps;
	}

}
