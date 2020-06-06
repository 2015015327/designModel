package factoryMethod.factory;

import factoryMethod.operate.OperateBean;

public interface IFactory {
	public abstract OperateBean createBean();
}
