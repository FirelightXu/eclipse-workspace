package crazyJava;

public class ReferenceArrayTest {
	public static void main(String[] args) {
		Person[] students;
		students = new Person[2];
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 158;
		Person lee = new Person();
		lee.age = 16;
		lee.height = 160;
		students[0] = zhang;
		students[1] = lee;
		students[1].info();
	}
}

class Person{
	public int age;
	public double height;
	public void info() {
		System.out.println("�ҵ������ǣ�" + age + "���ҵ�����ǣ� " +height );
	}
}