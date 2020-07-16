package observerModel.eventhandler;

import java.util.ArrayList;
import java.util.List;
 
/**��֪ͨ��
 * <pre>����: EventHandler</pre>
 * <pre>����: �¼�ִ��������װ�¼�</pre>
 * <pre>��Ȩ: web_chen@163.com</pre>
 * <pre>����: 2020/3/19 14:19</pre>
 * <pre>����: chenwb</pre>
 */
public class EventHandler {
 
	private List<AbstractEvent> eventList = new ArrayList<>();
 
	public boolean addEvent(AbstractEvent event) {
		return eventList.add(event);
	}
 
	/**
	 * @Description: ���ί���¼�
	 * @author chenwb
	 * @date 2020/3/19 14:20
	 * @param object �¼�ִ��Ŀ��
	 * @param methodName �¼�ִ�з���
	 * @param args ִ�в���
	 */
	public void addEvent(Object object, String methodName, Object... args) {
		eventList.add(new AbstractEvent(object, methodName, args));
	}
 
	/**
	 * @Description: �¼�ѭ��ִ��
	 * @author chenwb
	 * @throws Exception 
	 * @date 2020/3/19 14:21
	 */
	public void handle() throws Exception {
		for (AbstractEvent e : eventList) {
			e.invoke();
		}
	}
}
