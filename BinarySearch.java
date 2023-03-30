public class BinarySearch{
	public static void main(String[] args){
		int[]arr = new int[]{1,2,3,4,5};
		int target = 3;
		System.out.println(binarySearch(arr,target));
	}
	
	public static int binarySearch(int[]arr,int target){
		int s = 0,e = arr.length-1;
		
		while(s<=e){
			int m = s+(e-s)/2;
			
			if(arr[m] == target){
				return m;
			}
			else if(arr[m] > target){
				e = m - 1;
			}
			else s = m + 1;
		}
		return -1;
	}
}