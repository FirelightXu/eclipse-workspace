package java���ļ���;

public class StaticTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tom",40000);
		staff[1] = new Employee("Tim",50000);
		staff[2] = new Employee("Jack",65000);
		
		for (Employee e:staff) {
			e.setId();
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
		}
		
		int n = Employee.getNextId();
		System.out.println("Next available id=" + n);
	}
	
}
