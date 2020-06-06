package easyFactoryModel2;
//此模式为策略模式和工厂模式结�?
//factory为工厂算法，用于根据�?��实现的算法实例化出相应的类，工厂模式的出现使得类的�?合度降低成为可能
public class operation {
	private double numA,numB;

	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}
	public double GetResult() throws Exception{
		return 0;
	}
}
class AddNum extends operation{
	public double GetResult(){
		return getNumA()+getNumB();
	}
}
class SubNum extends operation{
	public double GetResult() {
		return getNumA()-getNumB();
	}
}
class MulNum extends operation{
	public double GetResult(){
		return getNumA()*getNumB();
	}
}
class DivNum extends operation{
	public double GetResult() throws Exception {
		if(getNumB() == 0){
			throw new Exception("除数不能�?");
		}
		return getNumA()/getNumB();
	}
}
