package stateModel;

public class Context {
	Context(statehandler state) {
		this.state = state;
	}
	private statehandler state;
	public statehandler getState() {
		return state;
	}
	public void setState(statehandler state) {
		this.state = state;
		System.out.println(state.getClass().getName());
	}
	public void request(){
		state.handler(this);
	}
}
