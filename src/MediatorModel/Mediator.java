package MediatorModel;

public interface Mediator {
	public abstract void send(String message,Colleague colleague);
}
