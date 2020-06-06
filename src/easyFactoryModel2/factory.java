package easyFactoryModel2;

public class factory {
	public static double getResult(double a,String b,double c) throws Exception{
		operation op=null;
		switch(b)
		{
		case "+":
			op=new AddNum();
			op.setNumA(a);
			op.setNumB(c);
			break;
		case "-":
			op=new SubNum();
			op.setNumA(a);
			op.setNumB(c);
			break;
		case "*":
			op=new MulNum();
			op.setNumA(a);
			op.setNumB(c);
			break;
		case "/":
			op=new DivNum();
			op.setNumA(a);
			op.setNumB(c);
			break;
		default:
			System.out.println("输入不正�?);
		}
	return op.GetResult();
	}
}
