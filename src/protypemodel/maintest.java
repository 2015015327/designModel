package protypemodel;

public class maintest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreateExam test1 = new ConcreateExam();
		test1.setId("10001");
		test1.setQuestion1("this is question 1");
		test1.setQuestion2("this is question 2");
		test1.setQuestion3("this is question 3");
		test1.setQuestion4("this is question 4");
		
		//定义test2为test1深拷贝
		ConcreateExam test2 = (ConcreateExam) test1.clone();
		test2.setQuestion1("this is question 1 deep clone");
		test2.setQuestion2("this is question 2 deep clone");
		test2.setQuestion3("this is question 3 deep clone");
		test2.setQuestion4("this is question 4 deep clone");
		System.out.println("deep clone test1 and test2 show --------------------");
		test1.show();
		test2.show();
		//定义test3为test1浅拷贝
		System.out.println("simble clone test1 and test3 show ------------------");
		ConcreateExam test3 = (ConcreateExam) test1.simpleClone();
		test3.setQuestion1("this is question 1 simple clone");
		test3.setQuestion2("this is question 2 simple clone");
		test3.setQuestion3("this is question 3 simple clone");
		test3.setQuestion4("this is question 4 simple clone");
		test1.show();
		test3.show();
	}

}
