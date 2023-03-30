import java.util.Arrays;
class MergeSortSelf{
	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		mergeSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	static void mergeSort(int[] arr, int start, int end){
		if(start<end){
			int mid = start + (end-start)/2;
			mergeSort(arr,0,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,0,mid,end);
		}
	}
	static void merge(int[] arr, int lb,int mid, int ub){
		int[] b = new int[arr.length];
		int i = lb;
		int j = mid+1;
		int k = 0 ;
		while(i<=mid && j<=ub){
			if(arr[i]<arr[j]){
				b[k]=arr[i];
				i++;
			}
			else{
				b[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			b[k]=arr[i];
			i++;
			k++;
		}
		while(j<=ub){
			b[k]=arr[j];
			j++;
			k++;
		}
		
		for(i=lb;i<=ub;i++)
			arr[i]=b[i];
	}
}
			
			