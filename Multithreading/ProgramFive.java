public class ProgramFive extends Thread{


	public void run(){
	
		System.out.println("Old Priority of "+Thread.currentThread().getName()+" is: "+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("New Priority of "+Thread.currentThread().getName()+" is: "+ Thread.currentThread().getPriority());

	}
		

	

	public static void main(String[] args){

		System.out.println("Old Priority of Main is :"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("New Priority of Main is :"+Thread.currentThread().getPriority());

		ProgramFive pf = new ProgramFive();
		pf.start();
	}
}