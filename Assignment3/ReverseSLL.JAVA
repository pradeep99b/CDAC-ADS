public class ReverseSLL{


	Node head;
	static class Node{

	int data;
	Node next;

	Node(int d){

	data = d;
	next = null;

	}

	}
	void display(Node head){

	Node n = head;
	while(n!=null){
		System.out.print(n.data+"--->");
		n = n.next;
	}
			
	
	}

	void insertAtBegining(int data){


		Node new_node = new Node(data);
		
		
		if(head == null){
			head=new_node;
			return;
		}

		new_node.next = head;
		head = new_node;

	}

	void insertAtEnd(int data){


		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			return;
		}
		Node n = head;
		while(n.next!=null){
			n = n.next;
		}
		n.next = new_node;
		
	}

	void insertAtMiddle(int pos,int data){


		Node new_node = new Node(data);

		if(head == null)
		{
			head = new_node;
			return ;
		}

		int count = 0;
		Node n = head;

		while(n!=null && count<pos){
			
			n = n.next;
			count++;
		}

		if(count==pos)
		{
			new_node.next = n.next;
			n.next = new_node;
			return;
		}

		System.out.println("Invalid Position");
	
	}

	Node reverse(){

		Node prev = null;
		Node current = head;
		
		while(current!=null){
		
			head = head.next;
			current.next = prev;
			prev = current;
			current = head;
	

		}


		return prev;
				

	}

	public static void main(String[] args){


	ReverseSLL sll = new ReverseSLL();

	sll.insertAtBegining(1);

	sll.insertAtMiddle(0,2);
	sll.insertAtMiddle(1,3);
	sll.insertAtMiddle(2,4);
	sll.insertAtMiddle(3,5);

	sll.insertAtEnd(6);

	sll.display(sll.head);
	System.out.println();
	sll.display(sll.reverse());


	}
}
	