class NumberOfDigitsInAnyBase{
	public static void main(String[] args){
		//int n=10;
		//int b =2;
		//getNoOfDigits(n,b); 
		//getSumOfRowOfPascalTriangle(4);
		int n =3;
		System.out.println(n>>1);
	}
	static void getNoOfDigits(int n,int b){  //Time Complexity is O(log(n))
		int noOfDigits = (int)(Math.log(n)/Math.log(b))+1;
		System.out.println(noOfDigits);
	}
	static void getSumOfRowOfPascalTriangle(int row){
		int sumOfRow = 1<<(row-1);
		System.out.println(sumOfRow);
	}	
}
