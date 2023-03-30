import java.util.*;
class MapDemo{
	public static void main(String[] args){
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"Saiful");
		hm.put(2,"Samsul");
		hm.put(3,"Atul");
		hm.put(4,"Uday");
		hm.put(5,"Dev");
		System.out.println(hm);
		for(Map.Entry element : hm.entrySet()){
			System.out.println(element.getKey()+" "+element.getValue());
		}
		hm.putIfAbsent(100,"Rahul");//insertion order is not maintains
		for(Map.Entry e : hm.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(6,"Abc");
		map.put(7,"Xyz");
		map.put(8,"Def");
		map.put(9,"Ghijk");
		for(Map.Entry e : map.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		System.out.println("----------------------------------");
		hm.putAll(map);
		for(Map.Entry e : hm.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		
		//remove(key) and remove(key,value) ---> both will work
		hm.remove(1);
		System.out.println(hm);
		System.out.println("------------------------------------");
		hm.remove(9,"Ghijk");
		System.out.println(hm);
		
		//replace(key,value)
		hm.replace(2,"Saiful");
		System.out.println(hm);
		/*
		HashMap<Integer,Integer> hm2 = new HashMap<>();
		hm2.put(1,100);
		hm2.put(2,200);
		hm2.put(3,300);
		hm2.put(4,400);
		hm2.put(5,500);
		System.out.println(hm2);
		for(Map.Entry element : hm2.entrySet())
			System.out.println(element.getKey()+" "+ element.getValue());
         */
	}
}