import java.util.*;
public class InsertionSort{
	public static void insertionSort(int a[]){
		for(int i=1;i<a.length;i++){
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp){
				a[j+1]=a[j];
				j--;
			}
		    a[j+1]=temp;
		}
		System.out.println("Array After sorting");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
			
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int []a = new int[5];
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
			a[i]=in.nextInt();
		System.out.println("Array before sorting");
		for(int i: a)
			System.out.print(i);
		System.out.println();
		insertionSort(a);
	}
}