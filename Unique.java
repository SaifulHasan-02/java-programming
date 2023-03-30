class Unique{
	public static void main(String[] args){
		int []a = {2,3,4,1,2,1,3,6,4};
		int ans = getUnique(a);
		System.out.println(ans);
	}
	static int getUnique(int []a){
		int unique = 0;
		for(int element : a)
			unique^=element;//unique=unique^element
		return unique;
	}
}	