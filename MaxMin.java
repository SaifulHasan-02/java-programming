class MaxMin{
	public static void main(String[] args){
		int []arr = {1,4,7,10,5,3};
		
		int ans = findMax(arr,arr.length);
		System.out.println(ans);
		int ansRec = findMaxRec(arr,arr.length);
		System.out.println(ansRec);
	}
	public static int findMax(int []arr,int n){
		if(n==1){
			return arr[0];
		}
		return Math.max(arr[n-1],findMax(arr,n-1));
	}
	public static int findMaxRec(int[] arr,int n){
		if(n==1)
			return arr[0];
		return Math.max(arr[n-1],findMaxRec(arr,n-1));
	}
		
}