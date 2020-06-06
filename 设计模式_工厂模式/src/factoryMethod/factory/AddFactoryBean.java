package factoryMethod.factory;

import factoryMethod.operate.AddOperateBean;
import factoryMethod.operate.OperateBean;

public class AddFactoryBean implements IFactory{

	public OperateBean createBean() {
		// TODO Auto-generated method stub
		return new AddOperateBean();
	}
	
}
