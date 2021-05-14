package employee;

public class Manager extends Employee{
	float salary;
	float incentive;
	public Manager(float s,float i) {
		salary=s;
		incentive=i;
	}
	public void getSalary() {
		float total = salary + incentive;
		System.out.println("Total salary of Manager "  +total);
		
	}
	
	

}
