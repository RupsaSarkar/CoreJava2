package dessertshop;

import java.util.Scanner;

public class ItemDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your role");
		String role=sc.nextLine();
		if(role.equalsIgnoreCase("Customer")) {
			System.out.println("Enter the item you want to buy");
			String item= sc.nextLine();
			System.out.println("Enter the quantity of item you want to buy");
			float quan= sc.nextFloat();
			if(item.equalsIgnoreCase( "Candy")) {
				Candy c = new Candy(quan);
				System.out.println("Your bill is Rs " +c.getCost());
			}
			else if(item.equalsIgnoreCase("Cookies")) {
				Cookies co = new Cookies(quan);
				System.out.println("Your bill is Rs " +co.getCost());
			}
			else if(item.equalsIgnoreCase("IceCream")) {
				IceCream ic = new IceCream(quan);
				System.out.println("Your bill is Rs " +ic.getCost());
			}
			
			
			
		}
		if (role.equalsIgnoreCase("Owner")){
			System.out.println("Enter the number of items you want to store");
			//int n= sc.nextInt();
			//for(int i=0;i<=n;i++) {
			System.out.println("Enter the item you want to store");
			String item1= sc.nextLine();
			System.out.println("Enter the quantity of item you want to store");
			float quan1= sc.nextFloat();
			System.out.println("You stored "  +quan1 + item1);
			
		 
			
		}
		

	}

}
