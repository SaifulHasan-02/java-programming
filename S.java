class A{
    A(){
		System.out.print("A");
	}
}
class S extends A{
	S(){
		System.out.print("S");
	}
	public static void main(String[] args){
		new S();
	}
}