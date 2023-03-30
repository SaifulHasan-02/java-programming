class NumberExample{
	public static void main(String[] args){
		printNum(5);
		//printNumRev(5);
	}
	public static void printNumRev(int n){
		if(n==0)
			return;
		System.out.println(n);
		printNumRev(n-1);
	}
	public static void printNum(int n){
		if(n==0)
			return;
		printNum(n-1);
		System.out.println(n);
	}
}