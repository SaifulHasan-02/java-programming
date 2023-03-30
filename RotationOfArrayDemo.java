import java.util.*;
class RotationOfArray{
	static void rotation(int []a ,int d){
		for(int i=1;i<=d;i++)
			rotationByOne(a);
	}
	static void rotationByOne(int []a){
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
			a[i]=a[i+1];
		a[a.length-1]=temp;
	}
}
class RotationOfArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int n = sc.nextInt(); 
		System.out.println("How many Rotation: ");
		int d = sc.nextInt(); 
		System.out.println("Enter Element in Array:");
		int [] a= new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		RotationOfArray.rotation(a,d);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.print(Arrays.toString(a));
	}
}