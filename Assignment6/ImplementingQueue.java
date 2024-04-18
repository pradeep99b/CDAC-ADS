public class ImplementingQueue{


	static final int MAX =5;
	int queue[] = new int[MAX];
	int rear,front;
	int size;

	ImplementingQueue(){

		front = -1;	
		rear = -1;
		size = 0;
	}

	void enqueue(int data){

		if(front==-1 && rear== -1)
		{
			queue[++rear]=data;
			front = 0;
			size++;
		}
		
		if(rear!=MAX-1){
			queue[++rear] = data;
			size++;	
		}
		else
			System.out.print("Queuue Overflow");

	}

	boolean isEmpty(){
	
		return size==0;

	}

	void dequeue(){

	if(isEmpty())
		System.out.println("Queue is Empty");

	else{

		int n = queue[front++];
		System.out.println("Element "+n+" was successfully deleted");
		size--;
	}

	}

	void display(){

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

		q.display();

		q.dequeue();
		q.dequeue();

		q.display();
	}

}




	
