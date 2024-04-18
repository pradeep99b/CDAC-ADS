public class SleepDemo extends Thread{


	public void run(){
		
		try{
		for(int i=0;i<6;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e){

			System.out.print(e)
		}
	}

	public static void main(String[] args){

		SleepDemo sd = new SleepDemo();
		sd.start();
	}
}
	