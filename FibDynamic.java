class FibDynamic{
	public static void main(String[] args){
		int n = 9;
		int ansRec = fib(n);
		System.out.println(ansRec);
		int ansDyn = fibDyna(n);
		System.out.println(ansDyn);
	}
	public static int fib(int n){
		if(n==0 || n==1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static int fibDyna(int n){
		int[] f = new int[n+2];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<=n;i++)
			f[i] = f[i-1]+f[i-2];
		return f[n];
	}
}
		