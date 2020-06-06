package stretagy;

public class cashReturn extends cashsuper{
	private double FullMoney,MoneyReturn;
	
	public cashReturn(double money,double fullMoney, double moneyReturn) {
		super();
		this.money=money;
		FullMoney = fullMoney;
		MoneyReturn = moneyReturn;
	}
	
	public double getFullMoney() {
		return FullMoney;
	}

	public void setFullMoney(double fullMoney) {
		FullMoney = fullMoney;
	}

	public double getMoneyReturn() {
		return MoneyReturn;
	}

	public void setMoneyReturn(double moneyReturn) {
		MoneyReturn = moneyReturn;
	}

	public double getMoney(){
		int i=0;
		i=(int) (money/FullMoney);
		System.out.println(money-i*MoneyReturn);
		return money-i*MoneyReturn;
	}

}
