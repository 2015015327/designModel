package IteratorModel;

public class testmain {
	public static void main(String args[]){
		ConcreateAggrate a = new ConcreateAggrate();
		a.add("test1");
		a.add("test2");
		a.add("test3");
		a.add("test4");
		a.add("test5");
		Iterator iterator = a.CreateIterator();
		while(iterator.hashNext()){
			System.out.println(iterator.next());
		}
	}
}
