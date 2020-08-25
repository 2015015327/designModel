package IteratorModel;

public class ConcreateIterator extends Iterator{
	private ConcreateAggrate aggrate;
	private int current = -1;
	public ConcreateIterator(ConcreateAggrate aggrate) {
		super();
		this.aggrate = aggrate;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggrate.getListObject(0);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret = null;
		current++;
		if(current < aggrate.count()){
			ret=aggrate.getListObject(current);
		}
		return ret;
	}

	@Override
	public boolean hashNext() {
		// TODO Auto-generated method stub
		return current<(aggrate.count()-1);
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggrate.getListObject(current);
	}

}
