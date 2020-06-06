package stretagy;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cashFactory a = new cashFactory(1000);
		cashFactory b = new cashFactory(1000, 0.1);
		cashFactory c = new cashFactory(1000, 300, 100);
		a.GetCash();
		b.GetCash();
		c.GetCash();
	}

}
