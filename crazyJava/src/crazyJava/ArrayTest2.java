package crazyJava;

import java.util.Arrays;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[]  a= new int[] {3,4,5,6};
		int[] a2 = new int[] {3,4,5,6};
		System.out.println(Arrays.equals(a, a2));
		int[] b= Arrays.copyOf(a, 6);
		System.out.println(Arrays.toString(b));
		Arrays.fill(b, 2,4,1);//°üÀ¨2²»°üÀ¨4
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		}
}
