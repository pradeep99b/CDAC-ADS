public class JoinDemo extends Thread{



	public void run(){
	try{
	for(int i=1;i<=5;i++)
	{
		System.out.println("Child thread : "+i);
		Thread.sleep(1000);
	}
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}

	}

	public static void main(String args[]) throws InterruptedException{

		JoinDemo jd = new JoinDemo();
		jd.start();
		jd.join();
			try{
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread : "+i);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}

	}

}