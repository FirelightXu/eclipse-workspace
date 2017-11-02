package algorithm;
//���������˼�룬ÿ��д���������ʱ��Ҫ����һ��˼·���о����������ư�
//ǰ�᣺
//1����һ��λ�÷ŵ������ȶ��ģ�
//2�����λ�ò���Ԥ�ڵ����ͽ���
//3��jҪ����ԭ�����Ǹ���

public class InsertSort {
	public static void main(String[]args) {
		int[] arr= {5,3,9,6,4,0};
		InsertSort.sort(arr);
		for(int a:arr) {
			System.out.println(a+" ");
		}
	}
	public static void sort(int[] arr) {
		for (int i =1;i<arr.length;i++) {
			int j =i;
			int target = arr[i];
			
			while(j>0&&target<arr[j-1]) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = target;
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
