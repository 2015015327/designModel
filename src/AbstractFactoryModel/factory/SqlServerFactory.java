package AbstractFactoryModel.factory;

import AbstractFactoryModel.AbstractFactoryImpl;
import AbstractFactoryModel.DataSourceImpl;
import AbstractFactoryModel.ViewImpl;
import AbstractFactoryModel.dataSource.SqlServerDataSource;
import AbstractFactoryModel.view.SqlServerView;

public class SqlServerFactory implements AbstractFactoryImpl{

	@Override
	public DataSourceImpl createDataSource() {
		// TODO Auto-generated method stub
		return new SqlServerDataSource();
	}

	@Override
	public ViewImpl createView() {
		// TODO Auto-generated method stub
		return new SqlServerView();
	}

}
