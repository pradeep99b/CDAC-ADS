public class List1{

	Node head;
	static class Node{
		int data;
		Node link;


		Node(int d){
		
			data = d;
			link = null;
		}
	}

	public void display()
	{
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.link;
		}
			


	}
	
	public void newBegin(int data){

		Node new_node = new Node(data);
		new_node.link = head;
		head = new_node;

	}
	public void newEnd(int data){

		Node new_node = new Node(data);
		if(head==null){
			head = new Node(data);
			return ;
		}
		else{
			Node n = head;
			while(n.link!=null)
				n=n.link;
			
			n.link = new Node(data);
			return;
		}
	}
	public void newMiddle(int data, Node pre_Node ){

		Node new_node = new Node(data);
		new_node.link = pre_Node.link;
		pre_Node.link = new_node;
	}
	public void newMiddle(int data, int num ){

		Node new_node = new Node(data);
		int count=0;
		Node n = head;
		while(count!=num){
			n=n.link;
			count++;
		}
		new_node.link = n.link;
		n.link = new_node;
	}

	public void removeFirst(){

		head = head.link;
	}

	public void removeMiddle(int pos){

		Node n = this.head;
		Node this.temp;
		for(int i=1;i<=pos;i++){
			n=n.link;
			if(i==(pos-1))
				temp=n.link;
		}
		temp.link = n.link;
	}

	public void removeEnd(){
		
		Node n = this.head;
		Node temp = this.head;
		while(n.link!=null){
			temp=n;
			n=n.link;
		}
		temp.link=null;
	}

	


	public static void main(String[] args){

		List1 ll = new List1();
		ll.head = new Node(25);
		
		Node second = new Node(22);
		Node third = new Node(33);

		ll.head.link = second;
		second.link = third;

		ll.display();
		System.out.print("\n");

		ll.newBegin(45);
		ll.display();
		System.out.print("\n");

		ll.newMiddle(30,second);
		ll.display();
		System.out.print("\n");

		ll.newMiddle(30,2);
		ll.display();
		System.out.print("\n");

		ll.newEnd(30);
		ll.display();
		System.out.print("\n");

		ll.removeEnd();
		ll.display();
		System.out.print("\n");
		
		ll.removeFirst();
		ll.display();
		System.out.print("\n");

		ll.removeMiddle(2);
		ll.display();
		System.out.print("\n");


	}

}