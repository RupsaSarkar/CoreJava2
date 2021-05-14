package bank;

public class SavingdAccount extends Bank{
	float interestrate;
	float years;
	float initialamount;
	public SavingdAccount(float i,float y,float r) {
		interestrate=i;
		years=y;
		initialamount=r;
		
		
	}
	public float amount() {
		 float FixedDeposit= interestrate*years*initialamount;
		return FixedDeposit;
	}

}
