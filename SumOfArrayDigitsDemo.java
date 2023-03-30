class SumOfArrayDigits{
	int sumOfDigits(int [][]a){
		int ans=Integer.MIN_VALUE;
		for(int row=0;row<a.length;row++){
			int sum=0;
			for(int col=0;col<a[row].length;col++){
				sum=sum+a[row][col];
			}
			if(sum>ans)
				ans=sum;
		}
		return ans;
	}
		
}
public class SumOfArrayDigitsDemo{
	public static void main(String[] args){
		SumOfArrayDigits obj=new SumOfArrayDigits();
		int [][]a={{1,2,3},{1,5},{5,5,10},{1,2,3,4,5,6}};
	    System.out.println("Wealth of Richest person: "+obj.sumOfDigits(a));
	}
}