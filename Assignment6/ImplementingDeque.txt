public class ImplementingDeque{

	Node head;
	static class Node{

		int data;
		Node next;
		
		Node(int data){

			this.data = data;
			next = null;
		}

	}


	void insertFront(int data){

		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			return;
		}
		new_node.next = head;
		head = new_node;
	}

	void insertRear(int data){

		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			return;
		}
		
		Node n = head;
		while(n.next!=null)
			n = n.next;

		n.next = new_node;
	}

	void deleteRear(){

		if(head == null){
			return;
		}
		
		Node n = head;
		Node p = null;
		while(n.next!=null){
			p=n;
			n = n.next;
		}

		p.next = null;
	}

	void deleteFront(){

		if(head == null){
			return;
		}
		head = head.next;
	}
	

	void display(){

		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}
	}

	

	public static void main(String[] args){


		ImplementingDeque idq = new ImplementingDeque();
		
		idq.insertFront(1);
		idq.insertRear(2);
		idq.insertRear(3);
		idq.insertFront(4);

		idq.display();

		System.out.println();

		idq.deleteFront();
		idq.deleteRear();

		idq.display();

	}
}

		
		
		
	
		