class SumOfDigitsRec{
	public static void main(String[] args){
		int n = 234;
		System.out.println(sumOfDigit(n));
		System.out.println(sumOfDigitRec(n));
	}
	public static int sumOfDigit(int n){
		int sum=0;
		while(n>0){
			int r = n%10;
			sum=sum+r;
			n/=10;
		}
		return sum;
	}
	public static int sumOfDigitRec(int n){
		if(n==0)
			return 0;
		return (n%10+sumOfDigitRec(n/10));
	}
}