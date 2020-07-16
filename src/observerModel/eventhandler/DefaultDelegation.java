package observerModel.eventhandler;

//事件观察者类，动态添加相关的观察者
public abstract class DefaultDelegation {

	private EventHandler eventHandler = new EventHandler();

	/**
	 * @Description: 新增委托
	 * @author chenwb
	 * @date 2020/3/19 13:46
	 * @param target
	 *            目标类
	 * @param methodName
	 *            目标方法
	 * @param args
	 *            args 可变入参
	 * @return void
	 */
	public void addListeners(Object target, String methodName, Object... args) {
		eventHandler.addEvent(target, methodName, args);
	}

	/**
	 * @Description: 通知他人
	 * @author chenwb
	 * @date 2020/3/19 14:17
	 * @return void
	 * @throws Exception 
	 */
	public void notifyOthers() throws Exception {
		eventHandler.handle();
	}

	/**
	 * 获取eventHandler
	 * 
	 * @return eventHandler
	 */
	public EventHandler getEventHandler() {
		return eventHandler;
	}

	/**
	 * 设置eventHandler
	 * 
	 * @param eventHandler
	 *            eventHandler
	 */
	public void setEventHandler(EventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}
}