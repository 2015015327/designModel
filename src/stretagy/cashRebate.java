package stretagy;

public class cashRebate extends cashsuper{

	private double CashRate;
	public cashRebate(double money,double CashRate){
		this.money=money;
		this.CashRate=CashRate;
	}
	public double getCashRate() {
		return CashRate;
	}
	public void setCashRate(double cashRate) {
		CashRate = cashRate;
	}
	public double getMoney() {
		System.out.println(CashRate*money);
		return CashRate*money;
	}
	
}
