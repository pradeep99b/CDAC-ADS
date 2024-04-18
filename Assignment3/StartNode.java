public class StartNode{


	Node head;
	static class Node{


		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}

	}

	static int start(Node head){


		Node fast = head;
		Node slow = head;
		
		while(fast!=null && fast.next!=null){
		
			slow = slow.next;
			fast = fast.next.next;

			if(fast==slow)
				break;

		}


		if(fast==null || fast.next==null)
		{
			return -1;
		}
		
		slow = head;
		
		while(slow!=fast){

			slow = slow.next;
			fast = fast.next;
		}


		return slow.data;
	}



	public static void main(String[] args){

	
		
		Node head = new Node(1);
		
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = head.next.next;

		System.out.print("Start Node is " +start(head));
	}

}