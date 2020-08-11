package AbstractFactoryModel.dataSource;

import AbstractFactoryModel.DataSourceImpl;

public class OracleDataSource implements DataSourceImpl{

	@Override
	public void getDataSource() {
		// TODO Auto-generated method stub
		System.out.println("这个是oracle数据源");
	}

}
