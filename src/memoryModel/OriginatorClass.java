package memoryModel;
//����¼�����ˣ��������ݱ���
public class OriginatorClass<T> {
	//������Ϣ
	public T object;

	public MemoryClass<T> createMemory(){
		return new MemoryClass<T>(object);
	}

	public T getObject() {
		return object;
	}
	public void recoverMemory(MemoryClass<T>  state){
		this.object=state.getMemory();
	}
	public void show(){
		System.out.println(object.getClass().getName());
		System.out.println(object.toString());
	}
}
