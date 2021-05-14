package bank;

public class test extends Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingdAccount s = new SavingdAccount(2f,2f,4000f);
		float savings= s.amount();
		CurrentAccount ca = new CurrentAccount(2000f,1000f);
		float current = ca.amount();
		float total = savings + current;
		System.out.println("The total cash amount is " +total);
 
	}

}
