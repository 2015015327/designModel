package memoryModel;
//备忘录信息管理
public class MemoryManager<T> {
	MemoryClass<T> memory;

	public MemoryClass<T> getMemory() {
		return memory;
	}

	public void setMemory(MemoryClass<T> memory) {
		this.memory = memory;
	}
	
}
