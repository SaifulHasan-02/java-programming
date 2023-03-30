class PatternDemo{
	public static void main(String[] args){
		patternOne(5);
		patternTwo(5);
		patternThree(5);
		patternFour(5);
		
	}
	static void patternOne(int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void patternTwo(int n){
		for(int row=1;row<=n;row++){
			for(int col=1;col<=n;col++)
				System.out.print("# ");
			System.out.println();
		}
		System.out.println();
	}
	static void patternThree(int n){
		for(int i =1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
	}
	static void patternFour(int n){
		for(int i=1;i<2*n;i++){
			int col= i>n ? 2*n-i : i;
			for(int j=1;j<= col;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}