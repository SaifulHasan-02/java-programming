class ReverseArray{
	public static void main(String[] args){
		int []arr = {1,2,3,4,5};
		char []ch ={'h','e','l','l','o'};
		reverse(arr,0,arr.length-1);
		reverseChar(ch);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(char ch1 : ch)
			System.out.print(ch1+" ");
	}
	public static void reverse(int []arr,int s,int e){
		while(s<e){
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}
	public static void reverseChar(char []arr){
		int s=0;
		int e = arr.length-1;
		while(s<e){
			char temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}
}