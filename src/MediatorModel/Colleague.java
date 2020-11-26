package MediatorModel;
/*
 * 中介者模式
 * */
public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
}
