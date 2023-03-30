class SquareRoot{
	public static void main(String[] args){
		int n = 40;
		int p = 3;
		//System.out.println(isSquareRoot(n));
		System.out.println(squareRootBS(n,p));
	}
	//O(n)
	public static boolean isSquareRoot(int n){
		
		if(n<0)
			return false;
		for(int i = 1;i<=n;i++){
			if(i*i == n)
				return true;
		}
		return false;
	}
	//T(n) = O(log(n))
	public static double squareRootBS(int n,int p){
		if(n<0)
			return -1;
		int s = 0;
		int e = n;
		double root = 0.0;
	    while(s<=e){
			int mid = s+(e-s)/2;
			if(mid*mid == n)
				return mid;
			else if(mid* mid > n)
				e=mid-1;
			else {
			    s=mid+1;
				root = mid;
			}
		}
		double incr = 0.1;
		for(int i = 0;i<p;i++){
			while(root*root<n){
				root += incr;
			}
			root -= incr;
			incr /= 10;
		}
		
		return root;
	}
}