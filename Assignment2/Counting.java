public class Counting{


	static void count(int n){

		if(n==0)
			return;
		
		else
		{	count(n-1);
			System.out.print(n+" ");
		}
	}
		
		


	public static void main(String[] args){
		
		int n =9;

		count(n);

	}

}