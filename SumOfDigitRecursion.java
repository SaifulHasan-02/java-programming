class SumOfDigitRecursion{
	public static void main(String[] args){
		int num = 125;
		int ans = sum(num);
		int ans2 = sum2(num);
		System.out.println(ans);
		System.out.println(ans2);
	}
	static int sum(int n){
		if(n==0)
			return 0;
		return n%10 + sum(n/10);
	}
	static int sum2(int n){
		int sum = 0;
		if(n<=0)
			n = n*(-1);
		while(n>0){
			int r = n%10;
			sum = sum+r;
			n/=10;
		}
		return sum;
	}
}