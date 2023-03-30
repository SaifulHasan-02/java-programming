import java.util.*;
class HashSetDemo{
	public static void main(String[] args){
		HashSet<Integer> hs = new HashSet<>();
		hs.add(2);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10); //this is not include because insertion is done on the basis of HashCode
		//so.HashCode for 10 is similar for line no. 6
		//simply say, set means no repetation
		System.out.println("Intial HashSet is "+hs);
		System.out.println(hs.contains(10));
		hs.remove(20);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		
		System.out.println("-------------------------------------");
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(2);
		lhs.add(4);
		lhs.add(6);
		lhs.add(8);
		lhs.add(10);
		//Major diff b/w HashSet and LinkedHashSet is order of insertion is maintain in LinkedHashSet
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		lhs.remove(2);
		System.out.println(lhs.contains(2));
		System.out.println(lhs);
		
		System.out.println("-------------------------------------");
		
		TreeSet<Integer> ts = new TreeSet<>();
		//Insertion is done in ascending order
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(6);
		ts.add(-10);
		ts.add(-20);
		ts.add(-15);
		System.out.println(ts);
		ts.remove(6);
		System.out.println(ts);
		System.out.println(ts.descendingSet());//use for print in descending order
	    System.out.println(ts.size());
	}
}