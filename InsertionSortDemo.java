import java.util.*;
class InsertionSort{
	public static void insertionSort(int []a){
		for(int i=0;i<a.length-1;i++){
			for(int j=1+i;j>0;j--){
				if(a[j]<a[j-1]){
					swap(a,j,j-1);
				}
				else
					break;
			}
		}
	}
	public static void insertionSort2(int []a){
		for(int i=1;i<a.length;i++){
			int j=i-1;
			int temp=a[i];
			while(j>=0 && a[j]>temp){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	static void swap(int []a,int j,int k){
		int temp=a[j];
		a[j]=a[k];
		a[k]=temp;
	}
}
class InsertionSortDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int [] a= new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		InsertionSort.insertionSort(a);
		System.out.print(Arrays.toString(a));
		InsertionSort.insertionSort2(a);
		System.out.print(Arrays.toString(a));
	}
}