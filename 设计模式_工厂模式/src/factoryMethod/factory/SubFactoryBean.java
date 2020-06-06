package factoryMethod.factory;


import factoryMethod.operate.OperateBean;
import factoryMethod.operate.SubOperateBean;

public class SubFactoryBean implements IFactory{

	public OperateBean createBean() {
		// TODO Auto-generated method stub
		return new SubOperateBean();
	}

}
