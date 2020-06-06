package proxyModel.staticProxyModel;

public class maintest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectImpl subject = new SubjectImpl();
		SubjectProxy proxy = new SubjectProxy();
		proxy.subjectimpl=subject;
		proxy.createData("wangzhixiang", "111");
		proxy.message();
	}

}
