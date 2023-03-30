class BSRecursionPractice{
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50};
		System.out.println(search(arr,0,arr.length-1,100));
	}
	static int search(int[] arr,int s, int e, int target){
		if(s>e)
			return -1;
		int mid = s+(e-s)/2;
		if(arr[mid]== target)
			return mid;
		else if(arr[mid]<target){
			return search(arr,mid+1,e,target);
		}
		else{
			return search(arr,s,mid-1,target);
		}
	}
}