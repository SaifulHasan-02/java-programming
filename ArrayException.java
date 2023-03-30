class ArrayException{
	public static void main(String[] args){
		int []arr = {1,2,3,4,5};
		try{
			print(arr);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Always run");
		}
	}
	public static void print(int []arr) throws ArrayIndexOutOfBoundsException {
			for(int i=0;i<=arr.length;i++){
				System.out.print(arr[i]+" ");
			}

	}
}