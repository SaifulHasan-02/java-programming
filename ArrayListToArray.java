import java.util.*;
class ArrayListToArray{
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);
		al.add(10);
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()){
			int element = itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		for(int e : al){
			System.out.print(e+" ");
		}
		System.out.println();
		//Convert into Array
		Integer []arr = new Integer[al.size()];
		arr = al.toArray(arr);
		for(int ele : arr){
			System.out.print(ele+" ");
		}
	}
}