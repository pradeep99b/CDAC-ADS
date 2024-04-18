import java.util.Scanner;
public class AssignmentOne{



	static void gcd(int a, int b){

		if(b==0)
			System.out.println(a);
		else
			gcd(b,a%b);

	}
				



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();


		System.out.println("GCD of "+a+" and "+b+" is:");
		gcd(a,b);



	}

}