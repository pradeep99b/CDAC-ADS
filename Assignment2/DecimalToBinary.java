import java.util.Scanner;
public class DecimalToBinary{

	static void function(int n,StringBuffer sb){

		if(n==1||n==0){
			sb.append(n);
			return;
		}
		else{
			function(n/2,sb);
			sb.append(n%2);
		}
			


	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the decimal number : ");
		int n = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		function(n,sb);
		System.out.print("The binary equivalent is :"+sb);


	}
}