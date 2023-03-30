import java.util.Arrays;
import java.util.Scanner;
class MinValue2D{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [][]arr=new int[3][3];
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<3;col++){
				arr[row][col]=sc.nextInt();
			}
		}
		int[] min=minValue(arr);
		System.out.println(Arrays.toString(min));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}
	public static int[] minValue(int[][] arr){
		int min=arr[0][0];
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<3;col++){
				if(min<arr[row][col]){
					min=arr[row][col];
					return new int[]{row,col};
				}
			}
		}
		return new int[]{-1,-1};
	}
}
				
		