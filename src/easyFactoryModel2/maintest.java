package easyFactoryModel2;

import java.util.Scanner;

import easyFactoryModel2.factoryEnum.CalcEnum;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,c;
		String b;
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextDouble();
		b=scanner.next();
		c=scanner.nextDouble();
		
		try {
			System.out.println(factory.getResult(a, CalcEnum.getEnum(b), c));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
