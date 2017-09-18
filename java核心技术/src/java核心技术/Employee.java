package java核心技术;

import java.time.LocalDate;
import java.util.*;

//public class Employee{
//	private static int nextId = 1;
//	
//	private String name;
//	private double salary;
////	private int id;
////	private LocalDate hireDay;
//	
//	public Employee(String n,double s) {
//		name = n;
//		salary = s;
////		id = 0;
//	}
//	public String getName() {
//		return name;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	
//	
//	public void raiseSalary(double byPercent) {
//		double raise = salary * byPercent/100;
//		salary += raise;
//	}
//	
////	public int getId() {
////		return id;
////	}
////	public void setId() {
////		id = nextId;
////		nextId++;
////	}
////	public static int getNextId() {
////		return nextId;
////	}
////	public static void main(String[] args) {
////		Employee e = new Employee("Harry",50000);
////		System.out.println(e.getName() + " " + e.getSalary());
////	}
//	
//	
//	
//	//employeerest 用
////	public Employee(String n,double s,int year,int month,int day) {
////		name = n;
////		salary = s;
////		hireDay = LocalDate.of(year, month, day);
////	}
////	public String getName() {
////		return name;
////	}
////	public double getSalary() {
////		return salary;
////	}
////	public LocalDate getHireDay() {
////		return hireDay;
////	}
////	public void raiseSalary(double byPercent) {
////		double raise = salary * byPercent/100;
////		salary += raise;
////	}
//}

public class Employee{
	private static int nextId;
	
	private int id;
	private String name;
	private double salary;
	
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	{
		id = nextId;
		nextId++;
	}
	public Employee(String n,double s) {
		name = n;
		salary = s;
		
	}
	public Employee(double s) {
		this("Employee #" + nextId,s);
		
	}
	public Employee(){
		
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
}