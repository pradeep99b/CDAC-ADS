public class Middle{

	
	Node head;
	static class Node{

		int data;
		Node next;


		Node(int d){

		data = d;
		next = null;
	
		}

	}

	void insertAtBegining(int data){

		Node new_node = new Node(data);

		if(head==null){
			head = new_node;
			return;
		}

		new_node.next = head;
		head = new_node;

	}

	void insertAtEnd(int data){

		Node new_node = new Node(data);

		if(head==null){
			head = new_node;
			return;
		}

		Node n = head;
		while(n.next!=null)
			n = n.next;

		n.next = new_node;

	}

	void insertAfter(int pos,int data){


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


	void display(){

		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}

	}

	int findMiddle(){


		Node fast = head;
		Node slow = head;

		while(fast.next.next!=null ){
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast.next==null)
				break;

		}

		return slow.data;

	}

	public static void main(String[] args){

		Middle mid = new Middle();

		mid.insertAtBegining(1);
		mid.insertAfter(0,2);
		mid.insertAfter(1,3);
		mid.insertAfter(2,4);
		mid.insertAfter(3,5);
		mid.insertAtEnd(6);

		mid.display();

		System.out.print("The middle element of the LinkedList is "+mid.findMiddle());
		
	}

}
		