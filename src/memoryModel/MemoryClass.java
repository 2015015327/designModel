package memoryModel;

//����¼ģʽ//������Ϣ�࣬���б�����Ϣ�洢
public class MemoryClass<T> {
	private T memory;

	public MemoryClass(T object){
		this.memory=object;
	}

	public T getMemory() {
		return memory;
	}

}
