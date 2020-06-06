package factoryMethod;

import factoryMethod.factory.AddFactoryBean;
import factoryMethod.factory.DivFactoryBean;
import factoryMethod.factory.IFactory;
import factoryMethod.factory.MulFactoryBean;
import factoryMethod.factory.SubFactoryBean;
import factoryMethod.operate.OperateBean;

public class maintest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory ifactory = new AddFactoryBean();
		//通过加法工厂生成加法方法
		OperateBean addBean= ifactory.createBean();
		ifactory = new SubFactoryBean();
		//通过减法工厂生成减法方法
		OperateBean subBean = ifactory.createBean();
		ifactory = new MulFactoryBean();
		//通过乘法工厂生成乘法操作
		OperateBean mulBean = ifactory.createBean();
		ifactory = new DivFactoryBean();
		//通过除法工厂生成除法方法
		OperateBean divBean = ifactory.createBean();
		addBean.operate();
		subBean.operate();
		mulBean.operate();
		divBean.operate();
	}

}
