package algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5,3,8,6,4};
		BubbleSort.sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	public static void sort(int[] arr) {
		for (int i =0;i<arr.length;i++) {
			for (int j = arr.length-1;j>i;j--) {
				if (arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
	}
	public static void swap(int[] arr,int i ,int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
	}
	//master test
}
