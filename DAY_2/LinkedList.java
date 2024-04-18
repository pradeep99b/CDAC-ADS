public class LinkedList{

	static Node head;


	static class Node{

	
		int data;
		Node link;
		
		Node(int d){

		data = d;
		link = null;
		}
	}

	static void Display(){

		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.link;
		}

	}


	public static void main(String[] args){


	LinkedList ll = new LinkedList();
	ll.head = new Node(11);
	Node second= new Node(22);
	Node third = new Node(33);

	ll.head.link = second;
	second.link = third;

	Display();
}

}