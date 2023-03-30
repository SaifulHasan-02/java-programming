class ExceptionHandling2{
	public static void main(String[] args){
		int a=5;
		int b =0;
		try{
			divide(a,b);
		}
		//more deep Exception class written first
		catch(ArithmeticException e){
			System.out.println(e);
		}
		// Less deep Exception class written later
		catch(Exception exc){
			System.out.println(exc);
		}
		//This finally block always run 
		finally{
			System.out.println("This will always run");
		}
	}
	public static int divide(int a,int b) throws ArithmeticException{
		if(b==0){
			throw new ArithmeticException("NOT POSSIBLE");
		}
		return a/b;
	}
		
}