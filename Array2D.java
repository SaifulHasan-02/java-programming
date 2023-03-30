import java.util.*;
public class Array2D{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[3][3];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int row=0;row<arr.length;row++)
			System.out.print(Arrays.toString(arr[row]));
		System.out.println();
		for(int[] element: arr)
			System.out.print(Arrays.toString(element));
	}
}
		
	