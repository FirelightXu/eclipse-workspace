package algorithm;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {5,3,8,6,4,7};
		QuickSort.sort(arr, 0, 5);
		for(int a:arr) {
			System.out.println(a+" ");
		}
			
	}
	public static int partition(int[] arr,int i,int j) {
		int TargetIndex = i;
		int TargetNum = arr[i];
		while(i<j) {
			while(i<j && arr[j] >= TargetNum) {
				j--;
			}
			while(i<j && arr[i] <= TargetNum) {
				i++;
			}
			swap(arr,i,j);
		}
		swap(arr,i,TargetIndex);
		return i;
	}
	public static void sort(int[] arr,int i,int j) {
		if (i >=j) {
			return ;
		}
		int target = partition(arr,i,j);
		sort(arr, i, target-1);
		sort(arr,target+1,j);
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
