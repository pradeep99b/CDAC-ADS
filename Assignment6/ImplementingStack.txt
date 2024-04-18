public class ImplementingStack{


	static final int MAX = 10;
	int arr[] = new int[MAX];
	int top;


	ImplementingStack(){

		top = -1;
	}

	void pop(){

		if(top==-1)
			System.out.print("Stack underflow");
		else{
			int n = arr[top--];
			System.out.print("Element "+n+" popped out of stack");
		}

	}

	void peek(){

		if(top == -1)
			System.out.print("Stack underflow");
		else
			System.out.print("Topmost element is : "+arr[top]);
	}

	void push(int n){

		if(top==MAX)
			System.out.print("Stack is FULL");
		else{
		
			arr[++top] = n;
		}

	}
		
	void display(){

		for(int i=0;i<=top;i++){

			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	void status(){


		if(top==-1)
			System.out.println("Stack is empty");	
		else if(top<=MAX){
			if(top==MAX)
				System.out.println("Stack is FULL");
			else{
				System.out.print("Count of elements in Stack is :"+top);
				System.out.print("Topmost element is : "+arr[top]);
			}
		}
	}

	public static void main(String[] args){


		ImplementingStack s = new ImplementingStack();
		
		s.push(2);
		s.push(3);
		s.push(4);
		
		s.display();

		s.pop();
		s.status();

		s.display();
		
	}
}

			