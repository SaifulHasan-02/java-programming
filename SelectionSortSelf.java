import java.util.Arrays;
class SelectionSortSelf{
	public static void main(String[] args){
		int[] arr = {4,5,1,2,3};
		selectionSortMax(arr);
		//selectionSortMin(arr); // checkkrna hoga glt ans aa rha hai
		System.out.print(Arrays.toString(arr));
	}
	public static void selectionSortMax(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int lastInd = arr.length - i - 1;
			int maxInd = getMaxInd(arr,0,lastInd);//maxInd means those index which have maximum value is placed
			swap(arr,lastInd,maxInd);
			
		}
	}
	public static void selectionSortMin(int[] arr){
		for(int i=0;i<arr.length;i++){
			int firstInd = i;
			int minInd = getMinIndex(arr,firstInd,arr.length-1);
			swap(arr,firstInd,minInd);
		}
	
	}
	public static int getMinIndex(int[] arr,int s,int e){
		int min = s;
		for(int i = 0;i<=e;i++){
			if(arr[min] > arr[i]){
				min = i;
			}
		}
		return min;
	}
	public static void swap(int[]arr,int f,int s){
		int temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
	}
	public static int getMaxInd(int[]arr,int s,int e){
		int max = s;
		for(int i = s;i<=e;i++){
			if(arr[max]<arr[i]){
				max = i;
			}
		}
		return max;
	}
}