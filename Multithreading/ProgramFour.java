public class ProgramFour extends Thread{

	public void run(){
	System.out.println("Child Thread");
	System.out.println(Thread.currentThread().getPriority());
	}


	public static void main(String[] args){
	
	System.out.println(Thread.currentThread().getPriority());
	ProgramFour t = new ProgramFour();
	t.start();
	
	}
}