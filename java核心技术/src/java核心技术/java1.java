package java���ļ���;
import static java.lang.Math.*;// ���Բ���math ֱ����sqrt

import java.io.Console;
import java.nio.file.Paths;
import java.util.Scanner;
//import java.util.Scanner;

public class java1 {
	
	public static final double CM_PER_INCH1 =2.55;
	
	public static void main(String[] args) {
		/*
		System.out.println("helloworld");
		System.out.print("hello");//system.out����
		
		
		final double CM_PER_INCH =2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		
		double x = 4;
		double y = Math.sqrt(x);
		System.out.println(y);
		
		double mx = 1.8732;
		int nx = (int) x;
		
		//�������
		double Vx = 1.99899;
		int mnx = (int)Math.round(x);
		
		int qx =2;
		int qy = 3;
		
		System.out.println(qx < qy ? qx:qy);
		
		String e = "";
		String greeting = "Hello";
		
		String s = greeting.substring(0, 3);
		System.out.println(s);
		
		String sx = "abc";
		String sy = "def";
		String sz = sx+sy;
		System.out.println(sz);
		
		String all = String.join("/", "s","q","er");
		System.out.println(all);
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.equals(s2));
		String s3 = "Abc";
		System.out.println(s2.equalsIgnoreCase(s3));//���Դ�Сд
		
		if(s1.length() == 0) {
		
		}
		if (s1.equals("")) {
			
		}
		
		int n = greeting.length();
		
		int cpCount = greeting.codePointCount(0, greeting.length());//
		
		System.out.println("n="+n + "cpcount" + cpCount);
		
		char first = greeting.charAt(0);
		
		//�ַ���������
		StringBuilder builder = new StringBuilder();
		builder.append("a");
		builder.append("abc");
		String completedString = builder.toString();
		System.out.println(completedString);
		
		Scanner in = new Scanner(System.in);
		System.out.println("what's your name");
		String name = in.nextLine();
		//��ȡһ������
		String firstname = in.next();
		//��ȡ����
		int age = in.nextInt();
		*/
		
		
		//console����ʹ�ñ���δ���
		
		/*
		System.out.println("----------------------");
		//Scanner���ǿ��Կ�������Ĳ��ʺ������������
		
		Console console = System.console();
		System.out.println("����������");
		String username = "";
		username = console.readLine();
		System.out.println("������������ǣ�"+username);
		//char[] passwd = cons.readPassword();
		
		*/
		
		
		//���
		System.out.printf("%8.2f", 10000.0/3.0); //Ҫ����С��λ�ľ��ȣ�����������߻����һ���ո�
		System.out.println();
		System.out.println(10000.0/3/0);
		
		String name = "xuye";
		int age = 12;
		System.out.printf("Hello,%s,Next year,you'll be %d",name,age);
		
		//��ȡ�ļ�
		//Scanner sc = new Scanner(filename.txt,"UTF-8");
		//PrintWriter out new PrintWriter("myfile.tet","UTF-8");
		
		float a = (float)5.6;
	}
}
