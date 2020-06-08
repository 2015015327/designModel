package easyFactoryModel2;
//简单工厂的操作，但简单工厂不满足于开放-封闭原则
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
			throw new Exception("被除数不能为0");
		}
		return getNumA()/getNumB();
	}
}
