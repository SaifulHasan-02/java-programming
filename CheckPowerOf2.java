class CheckPowerOf2{
	public static void main(String[] args){
		int n = 16;
		//System.out.println(checkPower(n));
		System.out.println(checkPowerRec(n));
		System.out.println(isPowerOfThree(n));
	}
	public static boolean checkPower(int n){
		if(n==1)
			return true;
		if(n==0)
			return false;
		while(n!=1){
			if(n%2 != 0)
				return false;
			n/=2;
		}
		return true;
	}
	static boolean checkPowerRec(int n){
		if(n==1)
			return true;
		if(n==0)
			return false;
		if(n % 2 == 0 && n != 1){
				return checkPowerRec(n/2);
		}
		else
			return false;
	}		
	public static boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        if(n % 3 != 0 || n==0)
            return false;
        return isPowerOfThree(n/3);
    }
}