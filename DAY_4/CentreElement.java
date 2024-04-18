public class CentreElement{



	static Node head;
	static class Node{


		int data;
		Node link;

		Node(int data){

			this.data=data;
			this.link = null;
		}
	}

	void centre(){

		Node fast=head;
		Node slow=head;

		while(fast!=null&&fast.link!=null){

			fast=fast.link.link;
			slow=slow.link;
		}
		
		System.out.println("Centre Element is :"+slow.data);
	}


	public static void main(String[] args){

		CentreElement ce = new CentreElement();
		ce.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node five = new Node(50);


		head.link = second;
        	second.link = third;
       		third.link = fourth;
        	fourth.link = five;

		ce.centre();
	}
}


		