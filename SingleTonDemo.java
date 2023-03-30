class SingleTon{
	private SingleTon(){
	}
	private static SingleTon instance;
	
	public static SingleTon getInstance(){
		if(instance==null){
			instance = new SingleTon();
		}
		return instance;
	}
}
class SingleTonDemo{
	public static void main(String[] args){
		//SingleTon obj1 = new SingleTon(); //not work because constructor is private
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		SingleTon obj3 = SingleTon.getInstance();
		//Here three ref variable obj1 ,obj2,obj3 pointing the same object.this means that only single object is created
		
	}
	
}