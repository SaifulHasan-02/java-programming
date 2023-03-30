class ProductOfTwoRec{
	public static void main(String[] args){
		int x =5;
		int y=3;
		System.out.println(product(x,y));
	}
	static int product(int x, int y){
		
		if(y>x)
			product(y,x);
		else if(y!=0)
			return (x+product(x,y-1));
		else
			return 0;
	}
}