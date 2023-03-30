import java.util.*;
class HashMapDemo{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,2,2};
		duplicate(arr);
		
	}
	public static void duplicate(int[] arr){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int ele: arr){
			if(hm.containsKey(ele)){
				int countTemp = (int)hm.get(ele);
				countTemp++;
				hm.replace(ele,countTemp);
			}
			else{
				hm.put(ele,1);
			}
		}
         int keyMax = 0;
		int max = Integer.MIN_VALUE;
		for(Map.Entry m : hm.entrySet()){
			if((int)m.getValue()>max){
				max = (int)m.getValue();
				keyMax = (int)m.getKey();
			}
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(max);
		System.out.println(keyMax);
		
		
	}
}