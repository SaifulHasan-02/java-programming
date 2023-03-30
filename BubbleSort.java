import java.util.Scanner;
import java.util.Arrays;
class BubbleSortDemo{
	static void bubbleSort(int []a){
		for(int i=0;i<a.length;i++){
			boolean count=false;
			for(int j=1;j<a.length-i;j++){
				if(a[j-1]>a[j]){
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					count=true;
				}
			}
			if(!count)
				break;
		}
					
	}
}
class BubbleSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] a= new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		BubbleSortDemo.bubbleSort(a);
		System.out.print(Arrays.toString(a));
	}
}
		