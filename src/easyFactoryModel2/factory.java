package easyFactoryModel2;

import easyFactoryModel2.factoryEnum.CalcEnum;

public class factory {
	public static double getResult(double a,CalcEnum b,double c) throws Exception{
		operation op=null;
		switch(b){
			case ADD:
				op=new AddNum();
				op.setNumA(a);
				op.setNumB(c);
				break;
			case SUB:
				op=new SubNum();
				op.setNumA(a);
				op.setNumB(c);
				break;
			case MUL:
				op=new MulNum();
				op.setNumA(a);
				op.setNumB(c);
				break;
			case DIV:
				op=new DivNum();
				op.setNumA(a);
				op.setNumB(c);
				break;
			default:
				System.out.println("can't find any class at easyFactoryModel");
		}
	return op.GetResult();
	}
}
