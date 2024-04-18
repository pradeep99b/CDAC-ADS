public class Fibonacci{


	static int series(int n){
		
		if(n<=1)
			return n;
		else 							 		return series(n-1)+series(n-2);


	}

	public static void main(String args[]){

	System.out.println(series(6));

	}



}