package employee;

public class Labour extends Employee {
	float salary;
	float overtime;
	public Labour(float s,float o) {
		salary=s;
		overtime=o;
	}
	public void getSalary() {
		float extra = 0.2f*salary;
		float total = salary + (overtime*extra);
		System.out.println("Total salary of Labour "  +total);
		
	}

}
