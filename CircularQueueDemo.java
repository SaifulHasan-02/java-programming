//remove method takes O(1) constant time ,which is less than O(n) which is
//taken by Queue
class CircularQueue{
	protected int[] data;
	private static final int DEFAULT_SIZE = 5;
	protected static int size = 0;
	protected int front = 0;
	protected int rear = 0;
	
	CircularQueue(){
		this(DEFAULT_SIZE);
	}
	CircularQueue(int size){
		this.data = new int[size];
	}
	public boolean insert(int item){
		if(isFull()){
			System.out.println("Queue is FULL");
			return false;
		}
		data[rear++]=item;
		rear %= data.length; //rear = rear % data.length;
		size++;
		return true;
	}
	public boolean isFull(){
		return size == data.length;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public int remove(){
		if(isEmpty()){
			System.out.println("Queueu is empty");
			return -1;
		}
		int removed = data[front++];
		front %= data.length; //front = front % data.length;
		size--;
		return removed;
	}
	public void firstElement(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		System.out.println(data[front]);
	}
	public void display(){
		if(isEmpty())
			System.out.println("Queue is Empty");
		int i = front;
		do{
			System.out.print(data[i]+" -> ");
			i++;
			i %= data.length;
		}while(i != rear);
		System.out.println("END");
	}
}
class DynamicCircularQueue extends CircularQueue{
	DynamicCircularQueue(){
		super();
	}
	DynamicCircularQueue(int size){
		super(size);
	}
	@Override
	public boolean insert(int item){
		if(isFull()){
			int[] temp = new int[data.length * 2];
		
			for(int i = 0;i<data.length;i++)
				temp[i]=data[(front+i)% data.length]; //important to understand
			front = 0;
			rear = data.length;
			data = temp;
		}
		return super.insert(item);
	}
}
class CircularQueueDemo{
	public static void main(String[] args){
		//CircularQueue queue = new CircularQueue();
		//DynamicCircularQueue queue = new DynamicCircularQueue();
		CircularQueue queue = new DynamicCircularQueue();
		queue.insert(2);
		queue.insert(4);
		queue.insert(6);
		queue.insert(8);
		queue.insert(10);
		queue.insert(12);
		queue.insert(14);
		queue.display();
		
		System.out.println("---------------------");
		System.out.println(CircularQueue.size);
		System.out.println("---------------------");
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		queue.insert(30);
		queue.display();
		
	}
}