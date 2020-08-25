package compsiteModel;

public class testmain {
	public static void main(String args[]){
		//设置根节点
		Compsite root = new Compsite("root");
		//设置叶子节点1
		Leaf leaf1 = new Leaf("leaf1");
		Leaf leaf2 = new Leaf("leaf2");
		root.add(leaf1);
		root.add(leaf2);
		Compsite batch1 = new Compsite("batch1");
		Compsite batch11 = new Compsite("batch11");
		Leaf leaf3 = new Leaf("Leaf3");
		batch1.add(batch11);
		batch11.add(leaf3);
		root.add(batch1);
		root.display();
	}
}
