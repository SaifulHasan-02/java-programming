class FindEvenDigitsDemo{
	int findNum(int []a){
		int count=0;
		for(int n:a){
			if(even(n))
				count++;
		}
		return count;
	}
	static boolean even(int n){
		if(digits(n)%2==0)
			return true;
		return false;
	}
	static int digits(int n){
		while(n>0){
			count++;
			n=n/10;
		}
		return count;
	}
}
			
		
class FindEvenDigits{
	public static void main(String[] args){
		int []a={12,345,2,6,7896};
		FindEvenDigitsDemo obj=new FindEvenDigitsDemo();
		System.out.println(obj.findNum(a));
	}
}
		
	