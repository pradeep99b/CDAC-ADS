public class DLL1{



	Node head;
	static class Node{

		int data;
		Node prev;
		Node next;

		Node(int data){

		this.data = data;
		prev = null;
		next = null;

		}
	}


	void insert(int data){

	Node new_node = new Node(data);
	new_node.next = head;
	new_node.prev = null;
	if(head!=null)
		head.prev = new_node;
	head = new_node;
	
	}

	void insertAtEnd(int data){

		
		Node n =head;
		Node p = null;
		Node current = head;

		if(head==null){
			insert(data);
			return;

		}
		
		while(n.next!=null)
			n=n.next;
		
		Node new_node = new Node(data);
		n.next = new_node;
		new_node.prev = n;
	
		
	

	}

	void insertAfterNode(int pos, int key){

		
		int count =0;
		Node p = null;
		Node n = head;
		while(count < pos && n!=null){
			n = n.next;
			count++;
		}
		
		
		
		Node new_node = new Node(key);
		new_node.next = n.next;
		n.next = new_node;
		new_node.prev = n;
		if(new_node.next !=null)
		(new_node.next).prev = new_node;
		



	}
	

	 void display(){

	Node p = null;
	Node n = head;

	System.out.println("---------------Forward direction--------------------");
	while(n!=null){
		System.out.print(n.data+"--->");
		p = n;
		n = n.next;
	}
	System.out.println();
	System.out.println("---------------Backward direction--------------------");
	while(p!=null){
		System.out.print(p.data+"--->");
		p = p.prev;
	}

	}

	public static void main(String[] args){


		DLL1 hi = new DLL1();

		hi.insert(23);
		hi.insert(21);

		hi.insertAtEnd(16);

		hi.insertAfterNode(1,67);
		hi.display();

	}
}
	
