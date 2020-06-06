package stretagy;

public class cashFactory {
	private cashsuper Cash_f=null;
	public cashFactory(double money){
		Cash_f = new cashnormal(money);
	}
	public cashFactory(double money,double rate){
		if(rate > 1){
			System.out.println("输入错误");
		}
		else{
			Cash_f = new cashRebate(money, rate);
		}
	}
	public cashFactory(double money,double fullMoney,double MoneyReturn){
		Cash_f = new cashReturn(money, fullMoney, MoneyReturn);
	}
	public double GetCash(){
		return Cash_f.getMoney();
	}
}
