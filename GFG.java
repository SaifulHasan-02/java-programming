import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int [] arr = new int[n];
	 for(int i =0;i<n;i++){
	     arr[i]=sc.nextInt();
	 }
	 int d = sc.nextInt();
	 rotate(arr,d);
	 for(int element : arr){
	     System.out.print(element+" ");
	 }
	 System.out.print(Arrays.toString(arr));
	 }
	 public static void rotate(int []arr,int d){
	     for(int i=1;i<=d;i++){
	         rotateByOne(arr);
	     }
	 }
	 public static void rotateByOne(int [] arr){
	     int temp = arr[0];
	     for(int i=0;i<arr.length-1;i++){
	         arr[i] = arr[i+1];
	     }
	     arr[arr.length-1] = temp;
	 
	 }
}