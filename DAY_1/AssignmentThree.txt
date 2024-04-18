import java.util.Scanner;
public class AssignmentThree{
	
	static int primeFactors(int n,int s){
	 
	   
		
	   if(s==1){
		System.out.print(s);
		return 1;
	   }
	   else{
		if(n%s==0)
			System.out.print(s+" ");
		primeFactors(n,s-1);
		
	   } 

		return 1;
	}

	

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		System.out.print("Prime Factors are :");
		primeFactors(n,(int)Math.sqrt(n));
		sc.close();
	}

}