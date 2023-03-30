import java.util.*;
class LinearSearchRec{
	public static void main(String[] args){
		int []arr = {5,3,7,10,60,4,4,2};
		int target = 4;
		int ans = search(arr,0,arr.length-1,target);
		if(ans==-1)
			System.out.println("NOT FOUND");
		else
			System.out.println("FOUND AT " + ans +" postion: "+arr[ans]);
		System.out.println(search2(arr,0,target));
		//search3(arr,0,target);
		//System.out.println(list);
		ArrayList<Integer> ansBest = serachBest(arr,0,target,new ArrayList<>());
		System.out.println(ansBest);
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> ansBest2 = serachBest(arr,0,target,list);
		System.out.println(ansBest2);
		System.out.println("-------------------------------------");
		//worst tarika hai 
		ArrayList<Integer>listW=serachWorst(arr,0,target);
		System.out.println(listW);
		
	}
	static int search(int []a,int s, int e, int target){
		if(s==a.length)
			return -1;
		if(a[s]==target)
			return s;
		return search(a,s+1,e,target);
		
	}
	static boolean search2(int []a,int index,int target){
		if(index==a.length)
			return false;
		return a[index]==target || search2(a,index+1,target);
	}
	/*
	static ArrayList<Integer> list = new ArrayList<>();
	static void search3(int []arr,int index,int target){
		if(index==arr.length)
			return;
		if(arr[index]==target)
			list.add(index);
		search3(arr,index+1,target);
	}
	*/
	static ArrayList<Integer> serachBest(int []a,int index,int target,ArrayList<Integer> list){
		if(index==a.length)
			return list;
		if(a[index]==target)
			list.add(index);
		return serachBest(a,index+1,target,list);
	}
	static ArrayList<Integer> serachWorst(int []a,int index,int target){
		//this is the worst technique beacuse of in every calls function create a different object of ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		if(index==a.length)
			return list;
		if(a[index] == target)
			list.add(index);
		
		ArrayList<Integer> ansFromBelowCalls = serachWorst(a,index+1,target); 
		list.addAll(ansFromBelowCalls);
		return list;
	}
}