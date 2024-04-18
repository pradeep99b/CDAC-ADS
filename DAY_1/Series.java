public class Series{

	static double result = 0;
	static double series(double n){
		
		if(n==1)
			return 1;
			
		else{
			result= Math.pow(-1,n+1)*1/n;
			return (result + series(n-1));
		}
	}

	public static void main(String args[]){

		System.out.println(series(3));

	}



}