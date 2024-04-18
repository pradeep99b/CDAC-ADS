public class BalancedParenthesis{



	private int capacity;
	private char[] stack;
	private int top;

	public BalancedParenthesis(int capacity){

		this.capacity = capacity;
		stack = new char[capacity];
		top = -1;
	}

	public boolean isFull(){
		
		if(top == (capacity -1))
			return true;
		return false;
	}

	public void push(char data){

		if(isFull()){
			System.out.println("Stack Overflow");
			return;
		}
		
		stack[++top] = data;
	}

	public boolean isEmpty(){

		if(top == -1){
			return true;
		}


		return false;

	}

	public char pop(){

		if(isEmpty()){
			return '\0';
		}

		return stack[top--];
	}
	
	public char peek(){

		if(isEmpty()){
			return '\0';
		}

		return stack[top];
	}

	public String isBalanced(String str){

		
		
		for(int i=0;i<str.length();i++){

			char ch = str.charAt(i);
			if(ch == ')' && this.peek() == '(')
				this.pop();
			else if(ch == ']' && this.peek() == '[')
				this.pop();
			else if(ch == '}' && this.peek() == '{')
				this.pop();
			else
				this.push(ch);

		}

		if(this.isEmpty())
			return "Balanced";
		else
			return "Unbalanced";

	}
	 


	public static void main(String args[]){

		String str = "[{({)}]";
		BalancedParenthesis bp = new BalancedParenthesis(str.length());
		System.out.print(str + " is " + bp.isBalanced(str));

	}

}

		