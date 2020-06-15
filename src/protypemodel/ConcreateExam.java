package protypemodel;

public class ConcreateExam extends AbstractExamPage{

	//深拷贝，新类修改原有的类不修改
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
	//浅拷贝，不实例化新类而是新建一个地址指向原来空间
	//浅拷贝特点，新有的修改原有的一样会修改
	@Override
	public AbstractExamPage simpleClone() {
		// TODO Auto-generated method stub
		AbstractExamPage vo = this;
		return vo;
	}

}
