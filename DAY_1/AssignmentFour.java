public class AssignmentFour{

	static boolean isPalindrome(int n){

		int k =n;
		int reverse = 0;
		while(k!=0){
			reverse= reverse*10 + k%10;
			k/=10;
		}
		
		if(reverse==n)
			return true;
		else
			return false;

	}
	public static void main(String[] args){

		System.out.println(isPalindrome(181));
	
	}

}