public class LinkedListMasterCode{


	Node head;
	static class Node {


		int data;
		Node link;
		
		Node(int data){

		this.data = data;
		link = null;

		}
	}

	void insertAtBegining(int data){

		Node new_node = new Node(data);

		if(head==null){
			head = new_node;
			return;
		}

		new_node.link = head;
		head = new_node;
	}

	void insertAtEnd(int data){


		Node new_node = new Node(data);
		Node current = head;
		
		if(head==null){
			head = new_node;
			return;
		}

	
		while(current.link!=null){
		
			current = current.link;
			
		}
		current.link = new_node;

	}

	void insertInMiddle(int data,int pos){
	
		Node new_node = new Node(data);
	
		if(pos==0)
			insertAtBegining(data);
		else{
			Node current = head;
			
			int count = 0;
			Node pre = null;
			while(count!=pos&& current!=null){
				pre = current;
				current = current.link;
				count++;
				
			}
			if(count==pos){
				new_node.link = current;
				pre.link = new_node;
			}
			else{
				System.out.println("Position undefined");
			}
				

		}

	}


	void display(){

	Node current = head;

		while(current!=null){
			System.out.print(current.data+" ");
			current = current.link;
		}
	}




	public static void main(String[] args){
		
		LinkedListMasterCode ll = new LinkedListMasterCode();
		ll.insertAtBegining(20);
		ll.insertAtBegining(30);
		ll.insertAtEnd(10);
		ll.insertAtEnd(40);
		ll.insertInMiddle(70,3);
		ll.display();
	}

}

		
			
		