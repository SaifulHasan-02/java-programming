class NumberOfSteps{
	public static void main(String[] args){
		int num = 41;
		int ans = numberOfSteps(num);
		System.out.println(ans);
	}
	static int numberOfSteps(int n){
		return helper(n,0);
	}
	static int helper(int n, int c){
		if(n==0)
			return c;
		if(n%2==0){
			return helper(n/2,1+c);
		}
		return helper(n-1,c+1);
	}
}