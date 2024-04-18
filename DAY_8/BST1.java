public class BST1{


	private Node root;
	static class Node{


	int data;
	Node left, right;
	
	Node(int d){

		data = d;
		left=right=null;	
	}

	}


	void displayInOrder(Node root){

		if(root==null)
			return;
		displayInOrder(root.left);
		System.out.print(root.data+" " );
		displayInOrder(root.right);

	}


	Node insert(Node root, int key){

		if(root==null){
			root = new Node(key);
			return root;
		}

		if(key<=root.data)
			root.left = insert(root.left,key);
		else if(key>root.data)
			root.right=insert(root.right,key);
	
		return root;
	}



	public static void main(String[] args){

		BST1 t1 = new BST1();
		t1.root = new Node(52);
		t1.root.left = new Node(36);
		t1.root.right = new Node(66);
		t1.root.left.left = new Node(24);
		t1.root.left.right = new Node(44);
		t1.root.left.right.left = new Node(40);
		t1.root.right.left = new Node(55);
		t1.root.right.right = new Node(72);

		t1.displayInOrder(t1.root);
		System.out.println();
		t1.insert(t1.root, 83);
		t1.displayInOrder(t1.root);
		t1.insert(t1.root, 53);
		t1.insert(t1.root, 50);
		t1.insert(t1.root, 3);
		System.out.println();
		t1.displayInOrder(t1.root);

		t1.reverse();
		t1.displayInOrder(t1.root);

		
	}

}

			
