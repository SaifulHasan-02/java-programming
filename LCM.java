class LCM{
	public static void main(String[] args){
		int a = 3;
		int b = 9;
		System.out.println(getLCM(a,b));
		System.out.println(getLCM2(a,b));
	}
	
	public static int getLCM(int a ,int b){
		for(int L = a>b ? a:b;L<=a*b;L+=(a>b?a:b)){
				if(L%a==0 && L%b==0){
					return L;
				}
		}
		return -1;
	}
	
	
	public static int getLCM2(int a,int b){
		int HCF = getHCF(a,b);
		int LCM = a*b/HCF;  //a*b = LCM*HCF
		return LCM;
	}
	public static int getHCF(int a,int b){
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a>b)
			return getHCF(a%b,b);
		return getHCF(b%a,a);
	}
}