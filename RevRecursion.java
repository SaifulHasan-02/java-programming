class RevRecursion{
	public static void main(String[] args){
		int n = 1234;
		int rev = revRecursion(n);
		int rev2 = reverse(n);
		int rev3 = reverseBest(n);
		System.out.println(rev);
		System.out.println(rev2);
		System.out.println(rev3);
	}
	static int sum = 0;
	static int revRecursion(int n){
		
		if(n==0)
			return sum;
		sum = n%10 + 10*sum;
		revRecursion(n/10);
		return sum;
	}
	static int reverse(int n){
		int rev = 0;
		while(n>0){
			int r = n%10;
			rev = rev*10 + r;
			n/=10;
		}
		return rev;
	}
	static int reverseBest(int n){
		
	}
}