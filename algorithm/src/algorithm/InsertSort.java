package algorithm;
//插入排序的思想，每次写插入排序的时候都要先缕一遍思路，感觉这个排序很绕啊
//前提：
//1：第一个位置放的数是稳定的；
//2：如果位置不是预期的数就交换
//3：j要放上原来的那个数

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
