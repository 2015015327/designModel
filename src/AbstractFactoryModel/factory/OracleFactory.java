package AbstractFactoryModel.factory;

import AbstractFactoryModel.AbstractFactoryImpl;
import AbstractFactoryModel.DataSourceImpl;
import AbstractFactoryModel.ViewImpl;
import AbstractFactoryModel.dataSource.OracleDataSource;
import AbstractFactoryModel.view.OracleView;

public class OracleFactory implements AbstractFactoryImpl{

	@Override
	public DataSourceImpl createDataSource() {
		// TODO Auto-generated method stub
		return new OracleDataSource();
	}

	@Override
	public ViewImpl createView() {
		// TODO Auto-generated method stub
		return new OracleView();
	}

}
