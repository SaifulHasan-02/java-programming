import java.util.Arrays;
class QuickSortSelf{
	public static void main(String[] args){
		int[] arr = {4,5,2,1,3};
		quickSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	public static void quickSort(int[] arr, int lb , int ub){
		if(lb>=ub)
			return;
		int s = lb;
		int e = ub;
		int mid = s+(e-s)/2;
		int pivot = arr[mid];
		while(s<=e){
			if(arr[s]<pivot)
				s++;
			if(arr[e]>pivot)
				e--;
			if(s<=e){
				swap(arr,s,e);
				s++;
				e--;
			}
		}
		quickSort(arr,lb,e);
		quickSort(arr,s,ub);
	}
	public static void swap(int[] arr ,int s,int e){
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
		
	}
}
			