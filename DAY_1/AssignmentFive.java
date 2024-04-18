import java.util.Scanner;
public class AssignmentFive{


	static boolean isPerfect(int n){
		
		if((int)Math.pow((int)Math.sqrt(n),2)==n)
			return true;
		else
			return false;
		

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		System.out.println(isPerfect(n));
		sc.close();
	}

}