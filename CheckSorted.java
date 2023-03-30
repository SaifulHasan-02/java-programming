class CheckSorted{
	public static void main(String[] args){
		int []a = {1,31,5,7,9,11};
		System.out.println(sorted(a,0));
	}
	static boolean sorted(int []arr,int index){
		if(index == arr.length-1)
			return true;
		return arr[index]<arr[index+1] && sorted(arr,index+1);
	}
}