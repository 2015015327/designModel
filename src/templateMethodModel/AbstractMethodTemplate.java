package templateMethodModel;

//ģ�巽��ģʽ��������ͨ�õĲ������󵽸��࣬�������е�ҵ��ŵ�����
//�����ڣ�ͨ�ò����϶࣬���������ͨ�ò���Ҳ���������еĲ���
public abstract class AbstractMethodTemplate {
	public void doOperation(){
		System.out.println("�����ģ�巽������ ��"+getAnswer());
	}
	public abstract String getAnswer();
}
