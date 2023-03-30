//In every remove function call O(n) time is taken ,this is so high.
//Therefor, to remove the complelxity of O(n) ,Circular Queue is come 
//into picture of time complexity of remove is O(1).. 
class CustomQueue{
	protected int[] data;
	static int size = 0;
	private int front = 0;
	private int rear = 0;
	private static final int DEFAULT_SIZE = 5;
	CustomQueue(){
		this(DEFAULT_SIZE);
	}
	CustomQueue(int size){
		this.data = new int[size];
	}
	public boolean insert(int item){
		if(isFull()){
			System.out.println("QUEUE IS FULL");
			return false;
		}
		data[rear++] = item;
		size++;
		return true;
	}
	public boolean isFull(){
		return size==data.length;
	}
	public int remove(){
		if(isEmpty()){
			System.out.println("QUEUE IS EMPTY");
			return -1;
		}
		int removed = data[front];
		//shift the data in left side by 1
		for(int i = 1;i<rear;i++){
			data[i-1]=data[i];
		}
		rear--;
		size--;
		return removed;
	}
	public boolean isEmpty(){
		return rear == 0;
		
	}
	public int firstItem(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		return data[front];
	}
	public boolean displayQueue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return false;
		}
		for(int i = front;i<rear;i++)
			System.out.print(data[i]+"->");
		System.out.println("END");
		return true;
	}
}
class DynamicQueue extends CustomQueue{
	DynamicQueue(){
		super();
	}
	DynamicQueue(int size){
		super(size);
	}
	@Override
	public boolean insert(int item){
		if(isFull()){
			int[] temp = new int[data.length * 2];
			for(int i = 0;i<data.length;i++)
				temp[i] = data[i];
			data = temp;
		}
		return super.insert(item);
	}
}
class CustomQueueDemo{
	public static void main(String[] args){
		//CustomQueue queue = new CustomQueue(2);  // using superclass
		DynamicQueue queue = new DynamicQueue(); // using subclass
		//CustomQueue queue = new CustomQueue(); //using memory method dispatch
		queue.insert(2);
		queue.insert(4);
		queue.insert(6);
		queue.insert(8);
		queue.insert(10);
		queue.insert(12);
		System.out.println(CustomQueue.size);
		//queue.insert(12);
		//System.out.println(queue.firstItem());
		//System.out.println(queue.isFull());
		queue.displayQueue();
		//System.out.println(queue.remove());
		//System.out.println(queue.remove());
		//System.out.println(queue.remove());
		//System.out.println(queue.remove());
		//System.out.println(queue.remove());
		//System.out.println(queue.firstItem());
		
	}
}