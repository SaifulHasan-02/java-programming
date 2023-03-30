import java.util.Arrays;
class TrianglePattern{
	public static void main(String[] args){
		//triangle(4,0);
		//triangle2(4,0);
		int[] arr= {5,4,3,2,1};
		bubbleSort(arr,arr.length-1,0);
		System.out.print(Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr,int r,int c){
		if(r==0)
			return;
		if(r>c){
			if(arr[c]>arr[c+1]){
				swap(arr,c,c+1);
			}
			bubbleSort(arr,r,c+1);
		}
		else{
			bubbleSort(arr,r-1,0);
		}
		
	}
	public static void swap(int[] arr,int f,int l){
		int temp = arr[f];
		arr[f] = arr[l];
		arr[l] = temp;
	}
	/*	
	public static void triangle(int r,int c){
		if(r==0)
			return;
		if(r>c){
			System.out.print("*");
			triangle(r,c+1);
		}
		else{
			System.out.println();
			triangle(r-1,0);
		}
	}
	public static void triangle2(int r,int c){
		if(r==0)
			return;
		if(r>c){
			triangle2(r,c+1);
			System.out.print("*");
			
		}else{
			triangle2(r-1,0);
			System.out.println();
		}
	}
	*/
}