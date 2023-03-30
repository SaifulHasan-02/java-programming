import java.util.Arrays;
class QuickSort{
	public static void main(String[] args){
		int []arr = {5,4,3,2,1};
		quickSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	static void quickSort(int []a,int lb, int ub){
		if(lb>=ub)
			return;
		int s = lb;
		int e = ub;
		int mid = s+(e-s)/2;
		int pivot = a[mid];
		while(s<=e){
			while(a[s]<pivot)
				s++;
			while(a[e]>pivot)
				e--;
			if(s<=e){
				int temp = a[s];
				a[s] = a[e];
				a[e] = temp;
				s++;
				e--;
			}
		}
		quickSort(a,lb,e);
		quickSort(a,s,ub);
	}
}