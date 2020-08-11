package AbstractFactoryModel;

public interface AbstractFactoryImpl {
	public DataSourceImpl createDataSource();
	public ViewImpl createView();
}
