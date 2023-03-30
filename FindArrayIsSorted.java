class FindArrayIsSorted{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		System.out.println(isSorted(arr,arr.length));
		System.out.println(isSortedItr(arr));
	}
	public static boolean isSorted(int[] arr,int index){
		if(index==0 || index==1)
			return true;
		if(arr[index-1]>arr[index-2])
			return isSorted(arr,index-1);
		return false;
	}
	public static boolean isSortedItr(int[] arr){
		if((arr.length-arr.length)==0)
			return true;
			
		for(int i = 1;i<arr.length;i++){
			if(arr[i-1]>arr[i])
				return false;
		}
		return true;
	}
}

		