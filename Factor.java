import java.util.*;
class Factor{
	public static void main(String[] args){
		int n = 36;
		//getFactor(n);
		//getFactor2(n);
		//getFactor3(n);
		getFactor4(n);
	}
	//T(n) = O(n)
	public static void getFactor(int n){
		for(int i = 1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
	}
	//this method is used to overcome the prblm of getFactor2() and getFactor3()
	public static void getFactor4(int n){
		//TreeSet use because Set means no repetation and tree means sorted order
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0){
				ts.add(i);
				ts.add(n/i);
			}
		}
		System.out.println(ts);
	}
	//T(n) = O(sqrt(n)) ,,,, S(n) = O(1)//problem is that ans is printed in unsorted order
	public static void getFactor2(int n){
		for(int i = 1;i<=Math.sqrt(n);i++){
			if(n % i == 0){
				if(n/i == i)
					System.out.print(" "+i+" ");
				else	
					System.out.print(i+" "+n/i+" ");
				
			}
		}
	}
	//T(n) = O(sqrt(n)) ,,,S(n) = O(n)
	public static void getFactor3(int n){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1;i<=Math.sqrt(n);i++){
			if(n%i == 0){
				if(n/i == i){
					System.out.print(i+" ");
				}
				else{
					System.out.print(i+" ");
					list.add(n/i);
				}
			}
		}
		for(int i=list.size()-1;i>=0;i--)
			System.out.print(list.get(i)+" ");
			
	}
}