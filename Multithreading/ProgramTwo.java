public class ProgramTwo implements Runnable{
	
	@Override
	public void run(){
		System.out.println("Thread task 2 Creating threads via Interface");
	}

	public void run(String s){
		
		System.out.println(s);
	}

	public static void main(String[] args){

		ProgramTwo pt = new ProgramTwo();
		Thread th = new Thread(pt);
		th.start("Hello");

	}
}