public class ProgramOne extends Thread{




	public void run(){

		System.out.println("Thread task ");
	}


	public static void main(String[] args){

		ProgramOne t = new ProgramOne();
		t.start();

	}
}
