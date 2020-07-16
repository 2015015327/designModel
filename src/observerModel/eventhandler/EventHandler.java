package observerModel.eventhandler;

import java.util.ArrayList;
import java.util.List;
 
/**先通知者
 * <pre>类名: EventHandler</pre>
 * <pre>描述: 事件执行器，封装事件</pre>
 * <pre>版权: web_chen@163.com</pre>
 * <pre>日期: 2020/3/19 14:19</pre>
 * <pre>作者: chenwb</pre>
 */
public class EventHandler {
 
	private List<AbstractEvent> eventList = new ArrayList<>();
 
	public boolean addEvent(AbstractEvent event) {
		return eventList.add(event);
	}
 
	/**
	 * @Description: 添加委托事件
	 * @author chenwb
	 * @date 2020/3/19 14:20
	 * @param object 事件执行目标
	 * @param methodName 事件执行方法
	 * @param args 执行参数
	 */
	public void addEvent(Object object, String methodName, Object... args) {
		eventList.add(new AbstractEvent(object, methodName, args));
	}
 
	/**
	 * @Description: 事件循环执行
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
