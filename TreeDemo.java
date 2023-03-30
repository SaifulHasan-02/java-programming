class Tree{
	public Node root;
	
	public void insertLeftNode(int data){
		Node node = new Node(data);
		if(root == null){
			root = node;
		}
		Node temp = root;
		while(temp.left != null){
			temp = temp.left;
		}
		temp.left = node;
	}
	public void insertRightNode(int data){
		Node node = new Node(data);
		if(root == null){
			root.right = node;
		}
		Node temp = root;
		while(temp.right != null){
			temp = temp.right;
		}
		temp.right = node;
	}
	/*
	public void display(){
		Node temp = root;
		if(temp == null)
		
	    if(temp){
			System.out.println(temp.data);
		
	}
	*/
	public void inOrder(Node head){
		if(head != null){
			inOrder(head.left);
			System.out.println(head.data);
			inOrder(head.right);
		}
	}
			
	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
}
class TreeDemo{
	public static void main(String[] args){
		Tree tr = new Tree();
		tr.insertLeftNode(2);
		tr.insertLeftNode(4);
		tr.insertLeftNode(6);
		tr.insertLeftNode(8);
		tr.insertRightNode(20);
		tr.insertRightNode(30);
		tr.insertRightNode(40);
		tr.insertRightNode(50);
		tr.inOrder(tr.root);
	}
}
		