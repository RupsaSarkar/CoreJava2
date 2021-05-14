package employee;

public class test extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager(60000f,3500.75f);
		m.getSalary();
		Labour l = new Labour(30000f,3.5f);
		l.getSalary();

	}

}
