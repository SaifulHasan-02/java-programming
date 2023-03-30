class HCF{
	public static void main(String[] args){
		int a = 10;
		int b = 5;
		System.out.println(getHcf(a,b));
	}
	static int getHcf(int a ,int b){
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a>b){
			return getHcf(a%b,b);
		}
		return getHcf(b%a,a);
	}
}