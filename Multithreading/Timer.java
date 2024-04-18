public class Timer extends Thread{


	public void run(){

		try{
		for(int i=0;i<=23;i++){
			for(int j=0;j<60;j++){
				for(int k=0;k<60;k++){
					System.out.print(i+":"+j+":"+k);
					Thread.sleep(1000);
					System.out.print("\033[H\033[2J"); 
					
				}
			}
		}


		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}

	public static void main(String[] args){

		Timer t = new Timer();
		t.start();
	}
}
