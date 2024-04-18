public class ImplementingQueue{


	static final int MAX =5;
	int queue[] = new int[MAX];
	int rear,front;

	ImplementingQueue(){

		front = -1;	
		rear = -1;
	}

	void enqueue(int data){

		if(front==-1 && rear== -1)
		{
			front++;
		}
		
		if(rear!=MAX-1)
			queue[++rear] = data;
		else
			System.out.println("Queue Overflow");

	}

	boolean isEmpty(){
	
		if(front>rear)
			return true;
		return false;

	}

	void dequeue(){

		if(isEmpty())
			System.out.println("Queue is Empty");

		else{

			int n = queue[front++];
			System.out.println("Element "+n+" was successfully deleted");
		
			if(front>rear)
			{
				front = -1;
				rear = -1;
	
			}
			
		}

	}

	void display(){

		if(isEmpty())
			System.out.println("Queue is Empty");


		for(int i = front; i<=rear;i++)
			System.out.print(queue[i]+ " ");

		System.out.println();
	}

	public static void main(String[] args){

		ImplementingQueue q = new ImplementingQueue();
		

		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(5);
		q.enqueue(6);

		q.display();

		q.dequeue();
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();

		q.display();
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(5);
		q.enqueue(6);
		
		q.display();

	}

}




	
