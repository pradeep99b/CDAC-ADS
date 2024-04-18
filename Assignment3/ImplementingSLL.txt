public class ImplementingSLL{


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

	if(head==null)
		System.out.println("LinkedList is Empty");
	Node n = head;
	while(n!=null){
		System.out.println(n.data);
		n = n.next;
	}
			
	
	}

	void insertAtBegining(int data){


		Node new_node = new Node(data);
		if(head == null)
			head = new_node;
		new_node.next = head;
		head = new_node;

	}

	void insertAtEnd(int data){


		Node new_node = new Node(data);
		if(head == null)
			head = new_node;
		Node n = head;
		while(n.next!=null){
			n = n.next;
		}
		n.next = new_node;
		
	}

	void insertAtMiddle(int data,int pos){


		Node new_node = new Node(data);
		int count = 1;
		Node n = head;

		if(head == null)
			head = new_node;

		Node n = head;
		while(n.next!=null && count < position){
			n = n.next;
			count++;
		}
		if(count==(position-1)){
			new_node.next = n.next;
			n.next = new_node;
		}

		
		
	}


	void deleteBegining(){


		if(head!=null)
			head = head.next;

	}

	void deleteEnd(){


		if(head == null)
			return ;

		Node n = head;
		while(n.next!=null)
			n = n.next;
		n.next = null;

	}


	void deleteAt(int pos){


		Node n = head;
		int count = 0;
		Node p = null;
		while(n.next!=null && count<pos){
			p = n;
			n = n.next;
		}

		if(count == pos && n.next!=null)
			p.next = n.next;
		else if(count == pos)
			p.next = null;
	}
			
			

	public static void main(String[] args){


	ImplementingSLL sll = new ImplementingSLL();

	sll.insertAtBegining(1);

	sll.insertAtMiddle(2,2);
	sll.insertAtMiddle(3,3);
	sll.insertAtMiddle(4,4);
	sll.insertAtMiddle(5,5);

	sll.insertAtEnd(6);

	sll.display(sll.head);

	sll.deleteBegining();
	sll.deleteEnd();
	sll.deleteAt(1);

	}
}
	