class PrimeNumber{
	public static void main(String[] args){
		int n = 40;
		boolean[] arr = new boolean[n+1];
		sieve(n,arr);
		//System.out.println();
		//System.out.println(isPrime(n));
		
		for(int i = 1 ;i<=n;i++){//T(n)=O(n)
			if(isPrime(i))
				System.out.println(i);
		}
		
		
	}
	// Sieve of Eratosthenes method
	public static void sieve(int n,boolean[] arr){  // T(n) = O(n*log(log(n))  // space = O(n)
		for(int i =2 ;i<=Math.sqrt(n);i++){
			if(!arr[i]){
				for(int j = 2*i;j<=n;j+=i){
					arr[j]=true;
				}
			}
		}
		for(int i = 2;i<=n;i++){
			if(!arr[i])
				System.out.print(i+" ");
		}
	}
	public static boolean isPrime(int n){  //T(n) = O(sqrt(n))
		if(n<=1)
			return false;
		int c = 2;
		while(c*c <= n){ //while(c<=Math.sqrt(n))
			if(n%c == 0)
				return false;
			c++;
		}
		
		return true;
	}
}