public class AssignmentSix{
	
	static int isArmstrong(int n){

		if(n<10)
			return n*n*n;
		else{

			int rem = n%10;
			return rem*rem*rem + isArmstrong(n/10);
		}

	}
	

	public static void main(String[] args){

		int n = 153;
		System.out.println(n==isArmstrong(n));
	}
}