import java.util.Scanner;
class OrderAgnosticBS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int []a =new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		int target = sc.nextInt();
		int index=orderAgnosticBS(a,target);
		if(index==-1)
			System.out.println("NOT FOUND");
		else
			System.out.println("found "+index);
	}
	public static int orderAgnosticBS(int []a,int target){
		int start=0;
		int end=a.length-1;
		boolean isAce = a[start]<a[end];
		while(start<=end){
			int mid=start+(end-start)/2;
			if(a[mid]==target)
				return mid;
			if(isAce){
				if(target<a[mid])
					end=mid-1;
				else 
					start=mid+1;
			}
			else{
				if(target>a[mid])
					end=mid-1;
				else
					start=mid+1;
			}
			
		}
		
		return -1;
	}
}