public class TreeDemo2{


	Node root;
	static class Node{

	int data;
	Node left,right;

	Node(int data){

	this.data = data;
	left = right = null;

	}


	}


	TreeDemo2(){
		root = null;

	}

	TreeDemo2(int data){
		root = new Node(data);

	}


	void displayInOrder(Node root){

	if(root==null)
		return;
	display(root.left);
	System.out.print(root.data+" " );
	display(root.right);

	}

	void displayPreOrder(Node root){

	if(root==null)
		return;
	
	System.out.print(root.data+" " );
	display(root.left);
	display(root.right);

	}




	public static void main(String[] args){

	
		TreeDemo2 td2 = new TreeDemo2();


		td2.root = new Node(20);
		td2.root.left = new Node(25);
		td2.root.right = new Node(30);
		td2.root.left.left= new Node(35) ;
		td2.root.left.right = new Node(40);

		td2.root.right = new Node(15);
		td2.root.right.left = new Node(150) ;
		td2.root.right.right = new Node(300) ;


		td2.displayPreOrder(td2.root);
	}

}
		