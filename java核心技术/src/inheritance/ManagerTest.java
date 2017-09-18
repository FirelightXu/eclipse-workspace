package inheritance;

public class ManagerTest {
	public static void main(String[] args) {
		Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
		boss.setBonus(5000);
		
		System.out.println("name=" + boss.getName() + "salary=" + boss.getSalary());
	}
}
