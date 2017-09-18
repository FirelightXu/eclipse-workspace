package arrayList;

import java.util.ArrayList;
public class ArraYListTest {
	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Carl Cracker",75000,1987,12,15));
		staff.add(new Employee("Carl Cracker2",75000,1987,12,15));
		staff.add(new Employee("Carl Cracker3",75000,1987,12,15));
		
		for (Employee e:staff) {
			e.raiseSalary(5);
		}
		for (Employee e:staff) {
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
		}
	}
	
}
