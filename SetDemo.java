import java.util.*;
class SetDemo{
	public static void main(String[] args){
		int[] arr = {3,4,5,1,3,5,4,7,3};
		int[] a1 = {1,2,3};
		int[] a2 = {2,3,4};
		//union(a1,a2);
		int i = interSection(a1,a2);
		//int s = noOfElementWithoutDup(arr);
		//System.out.println(s);
		System.out.println(i);
	}
	public static int noOfElementWithoutDup(int[] arr){
		Set<Integer> set = new HashSet<>();
		for(int element : arr){
			set.add(element);
		}
		return set.size();
	}
	public static void union(int[] a1, int[] a2){
		Set<Integer> set = new HashSet<>();
		for(int ele : a1){
			set.add(ele);
		}
		for(int ele : a2){
			set.add(ele);
		}
		System.out.println(set);
	}
	public static int interSection(int[] a1,int[]a2){
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for(int e: a1){
			set.add(e);
		}
		for(int e : a2){
			if(set.contains(e)){
				count++;
				set.remove(e);
			}
		}
		return count;
	}

}
	