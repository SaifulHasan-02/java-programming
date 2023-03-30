import java.util.*;
class Pair{
    int first, second;
    Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
    
}
class Comp implements Comparator<Pair>{
    public int compare(Pair p1, Pair p2){
        if(p1.first>p2.first) return -1;
        else if(p1.first<p2.first) return 1;
        else{
            if(p1.first>p2.first) return 1;
            else if(p1.first<p2.first) return -1;
            else return 0;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)  arr[i]=sc.nextInt();
		
		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comp());
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
		    map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		//System.out.println(map);
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
		    pq.add(new Pair(entry.getValue(), entry.getKey()));
		}
		//System.out.println(pq.peek().first);
		int[] ans = new int[arr.length];
		int size = pq.size(), j=0;
		for(int i=0;i<size;i++){
		    Pair p = pq.peek();
		    pq.remove();
		    int x = p.first, m=p.second;
		    while(x-->0){
		        ans[j]=m;
		        j++;
		    }
		}
		for(int i=0;i<ans.length;i++){
		    System.out.print(ans[i]+" ");
		}
	}
}