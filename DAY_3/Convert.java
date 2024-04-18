import java.util.Scanner;
public class Convert{

	static String convertLowerToUpper(String s){

		for(int i=0;i<s.length();i++){

		if(s.charAt(i)>='a' && s.charAt(i)<='z'){
			s = s.substring(0, i) + (char)(s.charAt(i)-32) + s.substring(i + 1);

		}
		}

		return s;
	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		String s= sc.next();
		System.out.print(convertLowerToUpper(s));
		sc.close();

	}

}