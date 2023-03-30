import java.util.Scanner;
class LinearSearchDemo{
	public static int search(int []arr,int x){
		for(int i=0;i<arr.length;i++){
			if(x==arr[i])
				return i;
		}
		return -1;
	}
	public static boolean search2(int []arr,int x){
		if(arr.length==0)
			return false;
		for(int element : arr){
			if(element==x)
				return true;
		}
		return false;
	}
}
public class LinearSearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		for(int ele : a)
			System.out.print(ele+" ");
		System.out.println("Enter a element you want to search");
		int x = sc.nextInt();
		int index=LinearSearchDemo.search(a,x);
		
		if(index==-1)
			System.out.println("NOT FOUND");
		else{
			System.out.println(x+" element is found at index "+index);
		    System.out.println();
		}
		System.out.println(LinearSearchDemo.search2(a,x));
		

			
	}
}