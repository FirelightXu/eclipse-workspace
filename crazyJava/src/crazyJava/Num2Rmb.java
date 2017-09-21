package crazyJava;

public class Num2Rmb {
	private String[] hanArr = {"零","一","二","三","肆","五","六","七","八","玖",};
	private String[] unitArr = {"十","百","千"};
	
	private String tohan(String num) {
		String result = "";
		for (int i = 0;i<num.length();i++) {
			int n = num.charAt(i)-48;
			System.out.println("i=" + i +"n=" +n);
			if(i !=num.length()-1&& n != 0) {
				result = result + hanArr[n] +unitArr[num.length()-2-i];//如果上面的判断条件没有-1会出现数组越界，是后面unitArr越界，要保证最后一个数没有单位
			}else {
				result = result + hanArr[n];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String testnum = "6039";
		Num2Rmb nr = new Num2Rmb();
		System.out.println(nr.tohan(testnum));
	}
}

