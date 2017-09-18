package java核心技术;

import java.time.*;
public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
		staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
		staff[2] = new Employee("Tony Tester",40000,1990,3,15);
//		staff[0] = new Employee("ca",75,1989,10,1);
		
		for (Employee e :staff)
			e.raiseSalary(5);
		for (Employee e:staff)
			System.out.println("name=" + e.getName() +",salary=" + e.getSalary() + ",hireDay="+ e.getHireDay());
	}
}
//定义的一个内部类，应该在原本类的外面


