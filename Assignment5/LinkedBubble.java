public class LinkedBubble{

	
	private Node head;
	static class Node{

		int data;
		Node next;

		Node(int d){
		
		data = d;
		next = null;

		}
	}


	Node bubble(){

		Node n = head;
		Node i = head;
		
		Node j = null;
		while(i.next!=null){

			j = i.next;
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
		

		return n;
		

	}

	void insertEnd(int d){

		
		Node new_node = new Node(d);
		if(head==null){
		
			head = new_node;
			return;
		}
		
		Node n = head;
		while(n.next!=null)
			n = n.next;

		n.next = new_node;
	}

	void display(){


		if(head == null)
			return;

		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}

	}

	void display(Node head){


		if(head == null)
			return;

		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}

	}
		
	public static void main(String args[]){


		LinkedBubble lb = new LinkedBubble();

		lb.insertEnd(9);
		lb.insertEnd(8);
		lb.insertEnd(7);
		lb.insertEnd(6);
		lb.insertEnd(5);
		lb.insertEnd(4);
		

		lb.display();
		System.out.println();
		Node k = lb.bubble();
		lb.display(k);
	}

}

			

			