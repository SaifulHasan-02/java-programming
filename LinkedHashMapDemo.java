import java.util.*;
class LinkedHashMapDemo{
	public static void main(String[] args){
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		lhm.put(101,"Saiful");
		lhm.put(102,"Uday");
		lhm.put(103,"Samsul");
		lhm.put(104,"Hasan");
		for(Map.Entry m:lhm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		System.out.println(lhm.keySet());
		System.out.println(lhm.entrySet());
		System.out.println(lhm.values());
		lhm.remove(102);
		System.out.println(lhm);
	}
}