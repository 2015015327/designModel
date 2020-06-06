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
		//ͨ���ӷ��������ɼӷ�����
		OperateBean addBean= ifactory.createBean();
		ifactory = new SubFactoryBean();
		//ͨ�������������ɼ�������
		OperateBean subBean = ifactory.createBean();
		ifactory = new MulFactoryBean();
		//ͨ���˷��������ɳ˷�����
		OperateBean mulBean = ifactory.createBean();
		ifactory = new DivFactoryBean();
		//ͨ�������������ɳ�������
		OperateBean divBean = ifactory.createBean();
		addBean.operate();
		subBean.operate();
		mulBean.operate();
		divBean.operate();
	}

}
