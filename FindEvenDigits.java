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
		/*if(digits(n)%2==0)
			return true;
		return false;*/
		return digits(n)%2==0;
	}
	static int digits(int n){
		if(n<0)
			n=n*-1;
		if(n==0)
			return 1;
		int count=0;
		while(n>0){
			count++;
			n=n/10;
		}
		return count;
	}
	/*
	staic int digits2(int n){
		if(n<0)
			n=n*-1;
		return (int)Math.log10(n)+1;
	}
	*/
}
			
		
class FindEvenDigits{
	public static void main(String[] args){
		int []a={12,345,2,6,7896};
		FindEvenDigitsDemo obj=new FindEvenDigitsDemo();
		System.out.println(obj.findNum(a));
		//System.out.println(FindEvenDigitsDemo.digits(-12));
		//System.out.println(FindEvenDigitsDemo.digits2(12453));
	}
}
		
	