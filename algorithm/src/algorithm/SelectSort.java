package algorithm;
//���������˼������ҵ���С��������ֵ�����δ�ǰ������ڸ��ڵ�λ���ϣ�Ҫע��ĵط��ǣ�����С����ֵʱ��Ҫ�Ƚϵ���arr[target]������arr[i]
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
