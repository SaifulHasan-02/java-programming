import java.util.*;
class CustomStack{
	protected int[] arr;
	private static final int DEFAULT_SIZE = 5;
	private int ptr = -1;
	CustomStack(){
		this(DEFAULT_SIZE);
	}
	
	CustomStack(int size){
		this.arr = new int[size];
	}
	
	public boolean push(int item){
	//public boolean push(int item) throws Exception{
		/*
		if(isFull())
			throw new Exception("Stack is full");
		*/
		if(isFull()){
			System.out.println("STack is full");
			return false;
		}
		
		ptr++;
		arr[ptr] = item;
		return true;
	}

	public boolean isFull(){
		/*if(ptr==arr.length-1)
			return true;
		return false;
		*/
		return ptr == arr.length-1;
	}
	public int pop(){
	//public int pop()throws Exception {
		/*if(isEmpty())
			throw new Exception("Stack is Empty");
		*/
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		int poped = arr[ptr];
		ptr--;
		return poped;
	}
	public boolean isEmpty(){
		/*if(ptr==-1)
			return true;
		return false;
		*/
		return ptr==-1;
	}
	public int peek(){
	//public int peek()throws Exception{
		/*
		if(isEmpty())
			throw new Exception("Stack is empty.So peek element ");
		*/
		if(isEmpty()){
			System.out.println("Stack is empty.No element is present in stack");
			return -1;
		}
		return arr[ptr];
	}
}
class DynamicStack extends CustomStack{
	DynamicStack(){
		super();
	}
	DynamicStack(int size){
		super(size);
	}
	@Override
	public boolean push(int item){
		if(isFull()){
			//Double the size of array
			int[] temp = new int[2*arr.length];
			//System.arraycopy(arr,temp,0,arr.length); //use to copy the element of array
			for(int i = 0;i<arr.length;i++){
				temp[i]=arr[i];
			}
			arr = temp;
		}
		return super.push(item);
	}
	
}
class CustomStackDemo{
	public static void main(String[] args){
		//CustomStack stk = new CustomStack(); // using superclass
		//DynamicStack stk = new DynamicStack(); // using subclass
		CustomStack stk = new DynamicStack();//using both ,memory dispatch
		stk.push(2);
		stk.push(4);
		stk.push(6);
		stk.push(8);
		stk.push(10);
		stk.push(20);
		stk.push(30);
		
		System.out.println(stk.isFull());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.isEmpty());
		
		
	}
}
		