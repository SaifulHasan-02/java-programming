import java.util.Arrays;
class BSin2DArray{
	public static void main(String[] args){
		int[][] arr = {{10,20,30},{15,25,35},{20,27,40}};
		int target = 270;
		//System.out.println(arr.length);
		//System.out.println(arr[0].length);
		//System.out.println(arr[1].length);
		//System.out.println(arr[2].length);
		System.out.print(Arrays.toString(getBS(arr,target)));
		System.out.print(Arrays.toString(searchSort(arr,target)));
		
	}	
	
	public static int[] getBS(int [][] arr,int target){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==target)
					return new int[]{i,j};
			}
		}
		return new int[]{-1,-1};
	}
	public static int[] searchSort(int[][] arr,int target){
		int r = 0;
		int c = arr[0].length-1;
		while(r<arr.length && c>=0){
			if(arr[r][c]==target)
				return new int[]{r,c};
			else if(arr[r][c]>target)
				c--;
			else 
				r++;
		}
		return new int[]{-1,-1};
	}
}
		
		
	
		