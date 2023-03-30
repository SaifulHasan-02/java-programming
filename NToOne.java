class NToOne{
	public static void main(String[] args){
		onetoN(5);
		ntoOne(5);
		System.out.println(fact(5));
	}
	static void onetoN(int n){
		if(n==0)
			return; 
		onetoN(n-1);
		System.out.println(n);
	}
	static void ntoOne(int n){
		if(n==0)
			return; 
		System.out.println(n);
		ntoOne(n-1);
	}
	static int fact(int n){
		if(n==0 || n==1)
			return n;
		return n*fact(n-1);
	}
}