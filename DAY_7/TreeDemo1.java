public class TreeDemo1{


	Node root;
	static class Node{

		int data;
		Node left, right;

		Node(int d){

			data = d;
			left = right = null;
		}
	}


	TreeDemo1(){
		
		root = null;
	}

	TreeDemo1(int d){
		
		root = new Node(d);
	}


	void printInOrder(Node root){

		if(root==null)
			return;
		printInOrder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
		
	}

	void insert(Node root, int key){
	
		if(root==null){
			root = new Node(key);
			return;
		}
		if(key<=root.data){
			
			root.left = insert(root.left,key);
		}
		else if(key>root.data){
			
			root.right = insert(root.right,key);
		}
		

	}
	public static void main(String[] args){

		TreeDemo1 td1 = new TreeDemo1();
		td1.root = new Node(5);
		td1.root.left = new Node(3);
		td1.root.right = new Node(7);
		td1.root.left.left = new Node(1);
		td1.root.left.right = new Node(4);

		td1.printInOrder(td1.root);
		td1.insert(8);
		td1.printInorder(td1.root);
	}
}




