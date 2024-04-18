public class Sum{


	static int sum(int n){

		if(n==1)
			return 1;
		else{
			int ans = n + sum(n-1);
			return ans;
		}
	}

	public static void main(String args[]){
		
		int n= 9;
	
		System.out.print(sum(n));
	}
}