package java核心技术;
import static java.lang.Math.*;// 可以不加math 直接用sqrt

import java.io.Console;
import java.nio.file.Paths;
import java.util.Scanner;
//import java.util.Scanner;

public class java1 {
	
	public static final double CM_PER_INCH1 =2.55;
	
	public static void main(String[] args) {
		/*
		System.out.println("helloworld");
		System.out.print("hello");//system.out对象
		
		
		final double CM_PER_INCH =2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		
		double x = 4;
		double y = Math.sqrt(x);
		System.out.println(y);
		
		double mx = 1.8732;
		int nx = (int) x;
		
		//舍入计算
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
		System.out.println(s2.equalsIgnoreCase(s3));//忽略大小写
		
		if(s1.length() == 0) {
		
		}
		if (s1.equals("")) {
			
		}
		
		int n = greeting.length();
		
		int cpCount = greeting.codePointCount(0, greeting.length());//
		
		System.out.println("n="+n + "cpcount" + cpCount);
		
		char first = greeting.charAt(0);
		
		//字符串构建器
		StringBuilder builder = new StringBuilder();
		builder.append("a");
		builder.append("abc");
		String completedString = builder.toString();
		System.out.println(completedString);
		
		Scanner in = new Scanner(System.in);
		System.out.println("what's your name");
		String name = in.nextLine();
		//读取一个单词
		String firstname = in.next();
		//读取整数
		int age = in.nextInt();
		*/
		
		
		//console对象使用报错，未解决
		
		/*
		System.out.println("----------------------");
		//Scanner类是可以看到输入的不适合于密码的输入
		
		Console console = System.console();
		System.out.println("请输入名字");
		String username = "";
		username = console.readLine();
		System.out.println("您输入的名字是："+username);
		//char[] passwd = cons.readPassword();
		
		*/
		
		
		//输出
		System.out.printf("%8.2f", 10000.0/3.0); //要两个小数位的精度，所以在最左边会输出一个空格
		System.out.println();
		System.out.println(10000.0/3/0);
		
		String name = "xuye";
		int age = 12;
		System.out.printf("Hello,%s,Next year,you'll be %d",name,age);
		
		//读取文件
		//Scanner sc = new Scanner(filename.txt,"UTF-8");
		//PrintWriter out new PrintWriter("myfile.tet","UTF-8");
		
		float a = (float)5.6;
	}
}
