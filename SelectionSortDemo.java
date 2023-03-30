import java.util.*;
class SelectionSort{
	static void selectionSort(int []a){
		for(int i=0;i<a.length;i++){
			int last = a.length-1-i;
			int maxIndex=getMaxIndex(a,0,last);
			swap(a,maxIndex,last);
		}
	}
	static int getMaxIndex(int []a,int start,int last){
		int max=start;
		for(int i=0;i<=last;i++){
			if(a[max]<a[i]){
				max=i;
			}
		}
		return max;
	}
	static void swap(int []a,int maxIndex,int last){
		int temp=a[maxIndex];
		a[maxIndex]=a[last];
		a[last]=temp;
	}
}
class SelectionSortDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int [] a= new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		SelectionSort.selectionSort(a);
		System.out.print(Arrays.toString(a));
	}
}