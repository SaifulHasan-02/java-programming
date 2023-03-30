import java.util.Arrays;
class SortedBS{
	public static void main(String[] args){
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.print(Arrays.toString(search(matrix,9)));
		
	}
	public static int[] binarySearch(int[][] arr,int rows,int cStart,int cEnd,int target){
			while(cStart<=cEnd){
				int mid =  cStart+(cEnd-cStart)/2;
				if(target==arr[rows][mid])
					return new int[]{rows,mid};
				else if(arr[rows][mid]<target){
					cStart=mid+1;
				}
				else{
					cEnd=mid-1;
				}
			}
			return new int[]{-1,-1};
		
	}
	public static int[] search(int[][] arr,int target){
		int rows = arr.length;
		int cols = arr[0].length;
		if(rows == 1){
			binarySearch(arr,0,0,cols-1,target);
		}
		int rStart = 0;
		int rEnd = rows-1;
		int cMid = cols/2;
		while(rStart<=rEnd){
			int rMid = rStart+(rEnd-rStart)/2;
			if(arr[rStart][cMid]==target){
				return new int[]{rStart,rEnd};
			}
			else if(arr[rStart][rEnd]>target){
				rEnd=rMid-1;
			}
			else{
				rStart=rMid+1;
			}
		}
		//when only search in mid cols
		if(arr[rStart][cMid]==target)
			return new int[]{rStart,cMid};
		if(arr[rStart+1][cMid]==target)
			return new int[]{rStart+1,cMid};
		//when only two rows are left
		//there are four possibilities
		if(arr[rStart][cMid-1]>=target)
			binarySearch(arr,rStart,0,cMid-1,target);
		if(arr[rStart][cMid+1]<=target && target<=arr[rStart][cols])
			binarySearch(arr,rStart,cMid+1,cols-1,target);
		if(arr[rStart+1][cMid-1]>=target)
			binarySearch(arr,rStart+1,0,cMid-1,target);
		else if(arr[rStart+1][cMid+1]<=target && target<=arr[rStart][cols])
			binarySearch(arr,rStart+1,cMid+1,cols-1,target);
		
		return new int[]{-1,-1};
	}
}