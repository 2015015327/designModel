package memoryModel;
//����¼��Ϣ����
public class MemoryManager<T> {
	MemoryClass<T> memory;

	public MemoryClass<T> getMemory() {
		return memory;
	}

	public void setMemory(MemoryClass<T> memory) {
		this.memory = memory;
	}
	
}
