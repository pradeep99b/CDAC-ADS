

import java.util.Scanner;
public class StringReverse{


	static int reverse(String sb,StringBuffer rev,int n){

	if(n==0){
		rev.append(sb.charAt(n));
		return 0;
	}
	else{
		rev.append(sb.charAt(n));
		reverse(sb,rev,n-1);
		return 0;
	}



	}
	
	
	
	public static void main(String[] args){

	String sb = new String();
	StringBuffer rev = new StringBuffer();
	Scanner sc = new Scanner(System.in);
	sb = sc.next();
	reverse(sb,rev,sb.length()-1);
	System.out.print(rev);
	}
}
