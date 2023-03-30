import java.util.*;
class CustomArrayList{
	private int[] arr;
	private int size;
	private static int DEFAULT_SIZE = 10;
	
	CustomArrayList(){
		this.arr = new int[DEFAULT_SIZE];
	}
	public void add(int num){
		if(isFull()){
			resize();
		}
		arr[++size] = num;
	}
	public boolean isFull(){
		if(size == arr.length)
			return true;
		return false;
		//return size == arr.length;
	}
	public void resize(){
		int [] temp = new int[arr.length*2];
		for(int i=0;i<arr.length;i++){
			temp[i]=arr[i];
		}
		arr=temp;
	}
	public int remove(){
		int removed = arr[--size];
		return removed;
	}
}
public class CustomArrayListDemo{
	public static void main(String[] args){
		CustomArrayList list = new CustomArrayList();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		list.add(15);
		
		//System.out.print(list+" ");
	}
}