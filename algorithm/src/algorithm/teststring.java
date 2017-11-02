package algorithm;

public class teststring {
	public static void main(String[] args) {
		String str = "big is pig";
		String s = ReverseSentence(str);
		System.out.println(s);
		
//		char[] c = {'a','b','c','d'};
//		reverse(c,0,3);
//		for(char i: c) {
//			System.out.println(i);
//		}
		
	}
	public static String ReverseSentence(String str) {
        char[] result1 = new char[str.length()];
        for (int i = 0;i<str.length();i++){
            result1[i] = str.charAt(i);
        }
        int start = 0;
        for (int i = 0;i<str.length();i++){
            if (result1[i] == ' '){
                reverse(result1,start,i-1);
                start = i+1;
            }
            

        }
        reverse(result1,start,str.length()-1);
        reverse(result1,0,str.length()-1);
        String b = new String(result1);
        return b;
    }
    public static void reverse(char[] ch,int i,int j){
    	System.out.println((i+j)/2);
        for (int k  = i;k<=(i+j)/2;k++){
            char temp = ch[k];
            ch[k] = ch[j];
            ch[j] = temp;
            j--;
        }
    }
}
