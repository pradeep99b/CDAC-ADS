public class Series{

	static int i =1;
	static double result = 0;
	static double series(double n){
		
		if(i==n && i%2==0)
			return -1;
		else if(i==n && i%2!=0)
			return 1;
			
		else{
			result= Math.pow(-1,i+1)*1/i;
			return result + series(n+1);
		}
	}

	public static void main(String args[]){

		System.out.println(series(6));

	}



}