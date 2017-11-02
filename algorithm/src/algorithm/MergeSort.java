package algorithm;


public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {5,3,8,6,4};
		MergeSort.sort(arr, 0, 4);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	public static void sort(int[] arr,int i,int j) {
		if (i >=j) {
			return;
		}
		int mid = (i + j)/2;
		sort(arr,i,mid);
		sort(arr,mid+1,j);
		merge(arr,i,mid,j);
		
	}
	public static void merge(int[] arr ,int i ,int mid,int j) {
		int [] temp = new int[j-i+1];
		int left = i;
		int right = mid+1;
		int k = 0;
		while(left <mid+1 && right <=j) {
			if(arr[left]<arr[right]) {
				temp[k++] = arr[left++];
			}else {
				temp[k++] = arr[right++];
			}
		}
		while(left<mid+1) {
			temp[k++] = arr[left++];
		}
		while (right<=j) {
			temp[k++] = arr[right++];
		}
		for(int p = 0;p<temp.length;p++) {
			arr[i+p] = temp[p];
		}
	}
}
