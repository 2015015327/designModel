package protypemodel;

public class ConcreateExam extends AbstractExamPage{

	//����������޸�ԭ�е��಻�޸�
	@Override
	public AbstractExamPage clone() {
		// TODO Auto-generated method stub
		AbstractExamPage vo = new ConcreateExam();
		vo.setId(this.getId());
		vo.setQuestion1(getQuestion1());
		vo.setQuestion2(getQuestion2());
		vo.setQuestion3(getQuestion3());
		vo.setQuestion4(getQuestion4());
		return vo;
	}
	//ǳ��������ʵ������������½�һ����ַָ��ԭ���ռ�
	//ǳ�����ص㣬���е��޸�ԭ�е�һ�����޸�
	@Override
	public AbstractExamPage simpleClone() {
		// TODO Auto-generated method stub
		AbstractExamPage vo = this;
		return vo;
	}

}
