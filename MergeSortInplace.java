import java.util.Arrays;
class MergeSortInplace{
	public static void main(String[] args){
		int []arr ={5,2,4,3,1};
		//mergeSortInplace(arr,0,arr.length-1);
		mergeSort(arr,0,arr.length-1);
		//System.out.print(Arrays.toString(arr));
		System.out.print(Arrays.toString(arr));
	}
	/*
	static void mergeSortInplace(int []arr,int s,int e){
		if(s<e){
		     int mid = s + (e-s)/2;
		     mergeSortInplace(arr,0,mid);
		     mergeSortInplace(arr,mid+1,e);
		     merge(arr,0,mid,e);
		}
	}
	static void merge(int []arr,int l,int mid,int e){
		int []b=new int[arr.length];
		int i = l;
		int j = mid+1;
		int k = l;
		while(i<=mid && j <= e){
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
		if(i>mid){
			while(j<=e){
				b[k]=arr[j];
				j++;
                k++;
			}
		}
		else{
			while(i<=mid){
				b[k]=arr[i];
				i++;
				k++;
				
			}
		}
		for(k=l;k<=e;k++)
			arr[k]=b[k];
	}
	*/
	static void merge(int[] arr, int l, int mid, int r)
    {
         // Your code here
         int i=0;
         int j=mid+1;
         int k=0;
         int[] b = new int[arr.length];
         while(i<=mid && j<=r){
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
         while(j<=r){
            b[k]=arr[j];
            k++;
            j++;
         }
         while(i<=mid){
            b[k]=arr[i];
            k++;
            i++;
         }
         for(k=l;k<=r;k++){
             arr[k]=b[k];
         }
    }
    static void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(arr,0,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,0,mid,r);
        }
    }
}