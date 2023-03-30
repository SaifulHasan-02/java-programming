import java.util.*;
class CeilingValue{
	public static void main(String[] args){
		int[] arr = {2,3,4,5,6,10};
		int target = 8;
		
		System.out.println(Arrays.toString(searchRange(arr,target)));
		//int cValue = ceilingValue(arr,target);
		//System.out.println(cValue);
		//int fValue = floorValue(arr,target);
		//System.out.println(fValue);
		//char[] ch = {'c','f','j'};
		//char ans = ceilingChar(ch,'k');
		//System.out.println(ans);
		
	}
	
	public static int floorValue(int[] arr,int target){
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end){
			int mid = start+(end - start)/2;
			if(arr[mid] == target)
				return arr[mid];
			else if(arr[mid] < target)
				start = mid+1;
			else 
				end = mid-1;
		}
		//return arr[end];
		return end;
	}
	public static int ceilingValue(int[] arr,int target){
		int start = 0;
		int end = arr.length-1;
	    
		if(target > arr[arr.length-1])
			return -1;
	     
		while(start <= end){
			int mid = start +(end-start)/2;
			if(arr[mid] == target)
				return arr[mid];
			else if(arr[mid]<target)
				start = mid+1;
			else
				end = mid-1;
		}
		//return arr[start];
		return start;
	}
	public static char ceilingChar(char[] ch,char target){
		int start = 0;
		int end = ch.length-1;
		while(start<=end){
			int mid = start+(end-start)/2;
			if(ch[mid]<target)
				start = mid+1;
			else
				end = mid -1;
		}
		return ch[start%ch.length];
	}
}
			
		