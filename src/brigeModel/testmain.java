package brigeModel;

import java.util.HashMap;

public class testmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDoOperate dooperate = new DoOperateA();
		dooperate.setSoftImpl(new ConcreateSoftImpA());
		dooperate.doOperate();
		dooperate.setSoftImpl(new ConcreateSoftImplB());
		dooperate.doOperate();
	}

}
