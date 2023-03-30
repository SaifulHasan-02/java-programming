import java.util.*;
class BinomialDyna{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value  of n: ");
		int n = sc.nextInt();
		System.out.println("Enter value of k (where k<=n): ");
		int k = sc.nextInt();
		System.out.println(getBinomail(n,k));
	}
	public static int getBinomail(int n, int k){
		int [][]C = new int[n+1][k+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=Math.min(i,j);j++){
				if(j==0 || j==i)
					return 1;
				C[i][j] = C[i-1][j-1]+C[i-1][j];
			}
		}
		return C[n][k];
	}
	
	/*
	public static int min(int a,int b){
		return a<b ? a : b;
	}*/
}
		