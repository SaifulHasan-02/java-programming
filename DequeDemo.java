import java.util.*;
class DequeDemo{
	public static void main(String[] args){
		/*
		Queue<Integer> que = new LinkedList<>();
		que.add(2);
		que.add(4);
		que.add(6);
		que.add(8);
		que.add(10);
		System.out.println(que.remove());
		*/
		Deque<Integer> deq = new ArrayDeque<>(); //Resizable array ,no restriction on size/capacity ,
		//faster than Stack when use as stack and faster than LinkedList when use as queue
		deq.add(5);
		deq.addFirst(10);
		deq.addLast(20);
		System.out.println(deq);
		deq.remove();
		System.out.println(deq);
		deq.removeFirst();
		System.out.println(deq);
		deq.removeLast();
		System.out.println(deq);
		deq.add(1);
		System.out.println(deq);
	}
}