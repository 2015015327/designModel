package observerModel.eventhandler;

//�¼��۲����࣬��̬�����صĹ۲���
public abstract class DefaultDelegation {

	private EventHandler eventHandler = new EventHandler();

	/**
	 * @Description: ����ί��
	 * @author chenwb
	 * @date 2020/3/19 13:46
	 * @param target
	 *            Ŀ����
	 * @param methodName
	 *            Ŀ�귽��
	 * @param args
	 *            args �ɱ����
	 * @return void
	 */
	public void addListeners(Object target, String methodName, Object... args) {
		eventHandler.addEvent(target, methodName, args);
	}

	/**
	 * @Description: ֪ͨ����
	 * @author chenwb
	 * @date 2020/3/19 14:17
	 * @return void
	 * @throws Exception 
	 */
	public void notifyOthers() throws Exception {
		eventHandler.handle();
	}

	/**
	 * ��ȡeventHandler
	 * 
	 * @return eventHandler
	 */
	public EventHandler getEventHandler() {
		return eventHandler;
	}

	/**
	 * ����eventHandler
	 * 
	 * @param eventHandler
	 *            eventHandler
	 */
	public void setEventHandler(EventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}
}