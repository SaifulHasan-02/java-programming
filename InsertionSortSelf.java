//this algo is good for patially sorted array .So,it take part in "HYBRID SORTING ALGO".
//Why good ? => no of comparission  get reduced when it face sorted part and in code using break;
// Worst => O(N^2)
//But for best case => O(N) linear in nature, because no. of comparission get reduced..
import java.util.Arrays;
class InsertionSortSelf{
	public static void main(String[] args){
		int[] arr = {4,5,1,2,3};
		insertionSort(arr);
		System.out.print(Arrays.toString(arr));
	}
	public static void insertionSort(int[] arr){
		for(int i = 0;i<arr.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(arr[j] < arr[j-1]){
					swap(arr,j,j-1);
				}
				else
					break;
			}
		}
	}
	public static void swap(int[]arr,int f,int s){
		int temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
	}
}