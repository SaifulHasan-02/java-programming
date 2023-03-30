import java.util.*;
class HashMapDup{
	public static void main(String[] args){
		int[] arr = {1,10,3,4,10,10};
		duplicate(arr);	
	}
	public static void duplicate(int[] arr){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int ele : arr){
			if(hm.containsKey(ele)){
				int count = (int)hm.get(ele);
				count++;
				hm.put(ele,count);
			}
			else{
				hm.put(ele,1);
			}
		}
		for(Map.Entry m : hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}
}
				
	