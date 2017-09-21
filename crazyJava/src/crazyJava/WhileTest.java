package crazyJava;

public class WhileTest {
	public static void main(String[] args) {
		int count = 0;
		while (count < 10) {
			System.out.println(count);
			count ++;
		}
		System.out.println("end");
		
		count = 0;
		System.out.println("start do while");
		do {
			System.out.println(count);
			count ++;
		}while(count <10);
		
		for(int i = 0;i <10;i++) {
			System.out.println(i);
		}
		
		System.out.println("````````````````");
		for(int b = 0,s=0,p=0;b<10&&s<4&&p<10;p++) {
			System.out.println(b++);
			System.out.println(++s + p);
		}
	}
}
