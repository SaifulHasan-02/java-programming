class ArmstrongNum{
	public static void main(String[] args){
		//int n = 153;
		//boolean ans = isArmstrong(n);
		//System.out.println(ans);
		for(int i = 1;i<=1000;i++){
			boolean ans = isArmstrong(i);
			if(ans == true){
				System.out.print(i+" ");
			}
		}
		
	}
	static boolean isArmstrong(int n){
		int sum = 0;
		int original = n;
		while(n>0){
			int r =  n % 10;
			sum = sum +  (r*r*r);
			n /= 10;
		}
		/*
		if(sum == original)
			return true;
		return false;
		*/
		return sum == original;
	}
}