class InfiniteArrray{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,10,15,17,20,26,27,30,31,32,35,40,45,47,50,55};
		int target = 15;
		//int res = searchIndex(arr,target);  //O(log(n))
		//System.out.println(res);
		System.out.println(search2(arr,target));  //O(n)
	}
	
	public static  int search2(int[] arr,int target){  //O(n)
		for(int i=0;;i++){   
			if(arr[i] == target)
				return i;
		}		
	}

	public static int searchIndex(int[] arr,int target){
		int start = 0;
		int end = 1;
		while(target>arr[end]){
			int newStart = end+1;
			int newEnd = 2*(end-start+1)+end;
			end = newEnd;
			start = newStart;
		}
		return searchBS(arr,start,end,target);
	}
	public static int searchBS(int[] arr,int start,int end,int target){
		if(start>end){
			return -1;
		}
		int mid = start+(end-start)/2;
		
		if(arr[mid] == target){
			return mid;
		}
		else if(arr[mid]>target){
			return searchBS(arr,start,mid-1,target);
		}
		else {
			return searchBS(arr,mid+1,end,target);
		}
		
		/*
		while(start<=end){
			int mid = start+(end-start)/2;
			if(arr[mid] == target){
				return mid;
			}
		    else if(arr[mid]>target){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		return -1;
		*/
		
	}
}