import java.util.Scanner;
public class AssignmentTwo{

		static int gcd(int a, int b){

		if(b==0)
			return a;
		else
			return gcd(b,a%b);

	}

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();


		System.out.println("LCM of "+a+" and "+b+" is:"+((a*b)/gcd(a,b)));
		sc.close();
		



	}

}