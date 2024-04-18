public class DoubleBubble{


	private Node head;
	static class Node{

		private int data;
		private Node next,prev;

		public Node(int d){

			data = d;
			next = prev = null;
		}

	}


	void insertAtBegining(int data){


		Node new_node = new Node(data);

		if(head == null){
			head = new_node;
			new_node.prev = null;
			return;
		}
	
		new_node.next = head;
		head.prev = new_node;
		new_node.prev = null;
		head = new_node;

	}

	void insertAtEnd(int data){


		Node new_node = new Node(data);

		if(head == null){
			head = new_node;
			new_node.prev = null;
			return;
		}

		Node n = head;
	
		while(n.next!=null)
			n = n.next;

		n.next = new_node ;
		new_node.prev = n;
		

	}

	Node bubble(){

		Node i = head;
		Node k = head;
		
		while(i.next!=null){

			Node j = i.next;
			while(j!=null){

				if(i.data > j.data){
		
					int temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
				j = j.next;

			}
			i = i.next;

		}


		return k;

	}


	void display(){

		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}

		System.out.println();
	}

	void display(Node head){

		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}

		System.out.println();
	}

	public static void main(String args[]){

	
		DoubleBubble db = new DoubleBubble();

		db.insertAtBegining(5);
		db.insertAtEnd(4);
		db.insertAtEnd(3);
		db.insertAtEnd(2);
		db.insertAtEnd(1);

		db.display();
		
		Node k = db.bubble();
		
		db.display(k);
		
	}
}

	
		
	
		

		