package crazyJava;

public class Num2Rmb {
	private String[] hanArr = {"��","һ","��","��","��","��","��","��","��","��",};
	private String[] unitArr = {"ʮ","��","ǧ"};
	
	private String tohan(String num) {
		String result = "";
		for (int i = 0;i<num.length();i++) {
			int n = num.charAt(i)-48;
			System.out.println("i=" + i +"n=" +n);
			if(i !=num.length()-1&& n != 0) {
				result = result + hanArr[n] +unitArr[num.length()-2-i];//���������ж�����û��-1���������Խ�磬�Ǻ���unitArrԽ�磬Ҫ��֤���һ����û�е�λ
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

