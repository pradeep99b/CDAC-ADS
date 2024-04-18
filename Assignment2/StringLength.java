public class StringLength{


	
	static int getLength(String s,int n){

		if(s.charAt(n)=='\0')
			return 0 ;
		else{

			return 1 + getLength(s,n+1);
		}
	}


	public static void main(String[] args){


		String s = "Hello";	
		int n = 0;
		n = getLength(s,n);
		System.out.print("The length of the String is :"+n);
	}
}