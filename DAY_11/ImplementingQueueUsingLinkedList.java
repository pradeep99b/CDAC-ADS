public class ImplementingQueueUsingLinkedList{


	
	Node head;
	Node front,rear;
	static class Node{

	int data;
	Node next;

	Node(int d){

		data =d;
		next=null;
	}

	}
	void enqueue(int data){

		Node new_node = new Node(data);
		System.out.println("Element "+data+" added to the queue.");

		if(head==null)
		{	front = head;
			head = new_node;
			rear= head;
		}
		
		else{
			
			rear.next = new_node;
			rear = rear.next;
		}

	}

	void dequeue(){


		if(head==null)
			System.out.println("Queue underflow");
		
		else{
			System.out.println("Element "+head.data+" deleted from the queue.");
			head = head.next;
			front = head;

			//if we deleted all elements reset the rear front values
			if(head==null)
				rear = front = null;
		}

	}

	void display(){

		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args){

		ImplementingQueueUsingLinkedList iq = new ImplementingQueueUsingLinkedList();
		iq.enqueue(1);
		iq.enqueue(2);
		iq.enqueue(3);
		iq.enqueue(4);
		iq.enqueue(5);
		iq.display();

		iq.dequeue();
		iq.dequeue();
		iq.dequeue();
		iq.dequeue();
		iq.dequeue();
		iq.display();

		iq.dequeue();
		iq.display();

		iq.enqueue(1);
		iq.enqueue(2);
		iq.enqueue(3);
		iq.enqueue(4);
		iq.enqueue(5);
		iq.display();

		iq.dequeue();
		iq.dequeue();
		iq.dequeue();
		iq.dequeue();
		iq.dequeue();
		iq.display();

		iq.dequeue();
		iq.display();

	}
}

		
	