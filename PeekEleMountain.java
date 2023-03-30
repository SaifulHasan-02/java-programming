class PeekEleMountain{
	public static void main(String[] args){
		//int[] arr = {10,20,15,12,5,4,3,2,1};
		int[] arr = {0,1,2,4,2,1};
		int target = 3;
		//int peekInd = peekEle(arr);
		//System.out.println(peekInd);
		//System.out.println(peekEle2(arr));
		System.out.println(mountainPeek(arr,target));
	}
	public static int peekEle(int[] arr){
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int mid = start+(end-start)/2;
			if(arr[mid]<arr[mid+1]){
				start = mid+1;
				
			}
			else if(arr[mid] < arr[mid-1]){
				end = mid-1;
			}
			else
				return mid;
		}
		return -1;
	}
	public static int peekEle2(int[] arr){	//By Kunal Kuswaha
		int start = 0;
		int end = arr.length-1;
		while(start < end){
			int mid = start+(end-start)/2;
			if(arr[mid]<arr[mid+1]){	//ascending part
				start = mid+1;
				
			}
			else if(arr[mid] > arr[mid+1]){	//descending part
				end = mid;
			}
			
		}
		return start;	//return end;
	}
	//when duplicate elements are present then return the 1st index of duplicate target
	public static int mountainPeek(int[] arr,int target){
		int start = 0;
		int end = peekEle(arr);
		while(start<=end){
			int mid = start+(end-start)/2;
			if(arr[mid] == target)
				return mid;
			else if(arr[mid]>target)
				end = mid-1;
			else
				start = mid+1;
		}
		return -1;
	}
}