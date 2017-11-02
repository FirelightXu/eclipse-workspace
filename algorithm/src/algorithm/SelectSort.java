package algorithm;
//插入排序的思想就是找到最小或者最大的值，依次从前往后放在该在的位置上；要注意的地方是，找最小（大）值时，要比较的是arr[target]而不是arr[i]
public class SelectSort {
	public static void main(String[] args) {
		int[] arr = {5,3,8,6,4};
		SelectSort.sort(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	public static void sort(int[] arr) {
		for (int i = 0;i<arr.length;i++) {
			int target = i;
			for (int j=i;j<arr.length;j++) {
				if (arr[j] <arr[target]) {
					target = j;
				}
			}
			swap(arr,i,target);

		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
