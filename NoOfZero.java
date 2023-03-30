class NoOfZero{
	public static void main(String[] args){
		int n = 10000019;
		int ans = noOfZero(n);
		int count = 0;
		int ans2 = noOfZeroRec(n,count);
		System.out.println(ans);
		System.out.println(ans2);
	}
	static int noOfZeroRec(int n, int count){
		if(n==0)
			return count;
		int r = n%10;
		if(r==0){
			return noOfZeroRec(n/10,++count);
		}
		else
			return noOfZeroRec(n/10,count);
			
	}
	static int noOfZero(int n){
		int count = 0;
		if(n<0)
			return -1;
		else if(n==0)
			return 1;
		while(n>0){
			int r = n%10;
			if(r==0){
				count++;
			}
			n/=10;
		}
		return count;
	}
}