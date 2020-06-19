package templateMethodModel;

public class testmain {
	
	AbstractMethodTemplate template;
	
	public AbstractMethodTemplate getTemplate() {
		return template;
	}

	public void setTemplate(AbstractMethodTemplate template) {
		this.template = template;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testmain testmain = new testmain();
		testmain.setTemplate(new MethodDoTemplate());
		testmain.getTemplate().doOperation();
		testmain.setTemplate(new MethodDoTemplate2());
		testmain.getTemplate().doOperation();
	}

}
