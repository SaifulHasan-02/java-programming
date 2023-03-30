import java.util.*;
class BitSet{
	public static void main(String[] args){
		int n = 6;
		//System.out.println(getSetBit(n));
		//getBinary(n);
		//getBinaryStack(n);
		getBinarySimple(n);
		
	}
	static void getBinarySimple(int n){
		System.out.print(Integer.toBinaryString(n));
	}
	static int getSetBit(int n){
		if(n==0)
			return -1;
		int count=0;
		while(n>0){
			if((n&1)==1)
				count++;
			n >>= 1;//n=n >> 1 right shift by 1
		}
		return count;
	}
	static int getSetBitRec(int n){
		if(n==0)
			return 0;
		return(n&1 + getSetBitRec(n >> 1));
	}
	static void getBinary(int n){
		int[] binary = new int[50]; //Extra space is used
		int i=-1;
		while(n>0){
			binary[++i] = n % 2;
			n/=2;
		}
		printArray(binary,i);
	}
	static void printArray(int[] arr,int n){
		for(int i=n;i>=0;i--)
			System.out.print(arr[i]+" ");
	}		
	static void getBinaryStack(int n){
		Stack<Integer> stk = new Stack<>();
		while(n>0){
			stk.push(n%2);
			n/=2;
		}
		while(!stk.isEmpty()){
			System.out.print(stk.pop()+" ");
		}
		
	}
	
		
}	