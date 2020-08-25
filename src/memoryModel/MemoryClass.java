package memoryModel;

//备忘录模式//备忘信息类，进行备忘信息存储
public class MemoryClass<T> {
	private T memory;

	public MemoryClass(T object){
		this.memory=object;
	}

	public T getMemory() {
		return memory;
	}

}
