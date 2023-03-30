import java.util.Arrays;
class SearchValue2D{
	public static void main(String[] args){
		int [][] arr={{1,2,3},{5,6},{10,20,0},{12,15,20,40}};
		int x=12;
		int []ans=searchValue(arr,x);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] searchValue(int[][]arr,int x){
		if(arr.length==0)
			return new int[]{-1,-1};
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
				if(arr[row][col]==x)
					return new int[]{row,col};
			}
		}
		return new int[]{-1,-1};
	}
}
		