package factoryMethod.factory;

import factoryMethod.operate.MulOperateBean;
import factoryMethod.operate.OperateBean;

public class MulFactoryBean implements IFactory{

	public OperateBean createBean() {
		// TODO Auto-generated method stub
		return new MulOperateBean();
	}

}
