package crazyJava;

public class ArrayTest {
	public static void mian(String[] args) {
		int[] intArr;
		intArr = new int[] { 5,6,8,20};
		Object[] objArr;
		objArr = new String[] {"Java","ligang"};
		Object[] objArr2 = new Object[] {"Java","lignag"};
		
		int[] prices = new int[5];
		Object[] books = new String[4];
		for (int i =0;i<prices.length;i++) {
			System.out.println(prices[i]);
		}
		String[] books2 = {"bala1","bala2","bala3"};
		for (String book : books2) {
			System.out.println(book);
		}
	}
}
