import java.util.Arrays;
class QSDemo{
	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		quickSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	public static void quickSort(int[] arr,int lb,int ub){
		if(lb>=ub)
			return;
		int s= lb;
		int e = ub;
		int m= s +(e-s)/2;
		int pivot = arr[m];
		while(s<=e){
			while(arr[s]<pivot)
				s++;
			while(arr[e]>pivot)
				e--;
			if(s<=e){
				int temp = arr[s];
				arr[s]= arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		quickSort(arr,lb,e);
		quickSort(arr,s,ub);
	}
}