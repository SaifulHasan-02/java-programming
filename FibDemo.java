class FibDemo{
	public static void mai(String[] args){
		System.out.println(fibFormula(50));
	}
	static int fibFormula(int n){
		return (int)(Math.pow((((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
	}
}
