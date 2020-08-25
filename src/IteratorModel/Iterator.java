package IteratorModel;

public abstract class Iterator {
	public abstract Object first(); 
	public abstract Object next();
	public abstract boolean hashNext();
	public abstract Object currentItem();
}
