import java.util.Arrays;
class Median{
	public static void main(String[] args){
		double []arr = {5,4,3.2,2,1,6};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(median(arr));
	}
	static double median(double []arr){
		int n = arr.length;
		double median = 0;
		if(n%2!=0)
			return median = arr[n/2];
		return median = (double)(arr[n/2]+arr[(n/2)-1])/2;
	}
}