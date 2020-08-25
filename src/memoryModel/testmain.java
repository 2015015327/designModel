package memoryModel;

public class testmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OriginatorClass<String> originator = new OriginatorClass<String>();
		originator.object="1111";
		originator.show();
		MemoryManager<String> manager = new MemoryManager<String>();
		manager.memory = originator.createMemory();
		originator.object="2222";
		originator.show();
		originator.recoverMemory(manager.getMemory());
		originator.show();
	}

}
