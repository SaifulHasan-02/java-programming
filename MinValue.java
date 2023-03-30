class MinValue{
	public static void main(String[] args){
		int []a= {12,18,10,20,5};
		int res=minValue(a);
		System.out.println(res);
		int ansRec = minValueRec(a,a.length);
		System.out.println(ansRec);
	}
	public static int minValue(int []arr){
		//int min=arr[0];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
	public static int minValueRec(int[] arr,int n){
		if(n==1)
			return arr[0];
		return Math.min(arr[n-1],minValueRec(arr,n-1));
	}
}