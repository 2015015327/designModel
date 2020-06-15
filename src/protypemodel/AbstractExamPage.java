package protypemodel;
//原型模式
public abstract class AbstractExamPage {
	private String id;
	private String question1;
	private String question2;
	private String question3;
	private String question4;
	public abstract AbstractExamPage clone();
	public abstract AbstractExamPage simpleClone();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQuestion1() {
		return question1;
	}
	public void setQuestion1(String question1) {
		this.question1 = question1;
	}
	public String getQuestion2() {
		return question2;
	}
	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	public String getQuestion3() {
		return question3;
	}
	public void setQuestion3(String question3) {
		this.question3 = question3;
	}
	public String getQuestion4() {
		return question4;
	}
	public void setQuestion4(String question4) {
		this.question4 = question4;
	}
	public void show(){
		System.out.println(this.getClass().getName());
		System.out.println(this.getId());
		System.out.println(this.getQuestion1());
		System.out.println(this.getQuestion2());
		System.out.println(this.getQuestion3());
		System.out.println(this.getQuestion4());
	}
}
