class ExceptionHandling{
	public static void main(String[] args){
		int a=5;
		int b =0;
		try{
			int c =a/b;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("This will always run");
		}
	}
}