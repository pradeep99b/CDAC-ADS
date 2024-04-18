public class InterruptEd extends Thread{

	
	public void run(){


		System.out.println(Thread.isinterrupted());
		
		try{	
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		}
	
		catch(InterruptedException e){
			e.printStackTrace();
		}

	}


	public static void main(String args[]){


		InterruptEd i = new InterruptEd();
	
		i.start();
		i.interrupt();

	}
}