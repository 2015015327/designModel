package memoryModel;
//备忘录发起人，进行数据备忘
public class OriginatorClass<T> {
	//备忘信息
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
