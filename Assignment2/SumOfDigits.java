import java.util.Scanner;
public class SumOfDigits{


	static int sum(int n){

		if(n<10)
			return n;
		else{
		   int sol = n%10 + sum(n/10);
		   return sol;
		}
	
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Sum is : "+sum(n));
	}
}

	