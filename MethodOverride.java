class Shapes{
	void area(){
		System.out.println("I am in Shapes class");
	}
}
class Circle extends Shapes{
	@Override
	void area(){
		System.out.println("I am in Circle class");
	}
}
class MethodOverride{
	public static void main(String[] args){
		//Circle circle = new Circle();
		//circle.area();   //circle area run hua
		//Shapes shape = new Shapes();
		//shape.area();     // shape ka area run hua
		Shapes shape = new Circle();  //method override hua hai isliye Circle ka area run hua 
		shape.area();
	}
}
	