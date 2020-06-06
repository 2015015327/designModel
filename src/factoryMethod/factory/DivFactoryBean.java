package factoryMethod.factory;

import factoryMethod.operate.DivOperationBean;
import factoryMethod.operate.OperateBean;

public class DivFactoryBean implements IFactory{

	public OperateBean createBean() {
		// TODO Auto-generated method stub
		return new DivOperationBean();
	}

}
