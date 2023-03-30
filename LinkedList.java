class LL{
	
	Node head;
	Node tail;
	int size = 0;
	
	class Node{
		int val;
		Node next;
		
		
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}
	void insertFirst(int x){
		if(head == null){
			insertLast(x);
			return;
		}
		Node node = new Node(x);
		node.next = head;
		head = node;
		size++;
	}
	void insertAtPost(int x,int pos){
		if(head == null){
			insertFirst(x);
			return;
		}
		Node temp = head;
		
		for(int i=0;i<pos-1;i++){
			temp = temp.next;
		}
		Node nxt = temp.next;
		temp.next = new Node(x);
		temp.next.next = nxt;
		size++;
	}
		
		
	
	void insertLast(int x){
		if(head == null){
			head = new Node(x);
			size++;
			tail = head;
			return;
		}
		Node temp = head;
		while(temp.next !=null){
			temp = temp.next;
		}
		temp.next = new Node(x);
		tail = temp.next;
		size++;
	}
	
	void display(){
		System.out.println(size);
		
		if(head == null){
			return;
		}
		Node temp = head;
		
		while(temp != null){
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		
	}
			
		
	
}

public class LinkedList{
	public static void main(String[] args){
		
		LL obj1 = new LL();
		obj1.insertFirst(20);
		obj1.insertLast(1);
		obj1.insertLast(2);
		obj1.insertLast(3);
		obj1.insertLast(4);
		obj1.insertLast(5);
		obj1.insertLast(100);
		obj1.insertFirst(2000);
		obj1.insertAtPost(10,4);
		obj1.display();
	}
}
	
