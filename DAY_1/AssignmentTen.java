import java.util.Scanner;
public class AssignmentTen{


	
	static int sum = 0;
	


	static int isAutomorphic(int n,int square,int count){
		if(n==0)
			return 0;
		else{
			sum+= (count*(square%10));
			n/=10;
			square/=10;
			count*=10;
			return sum + isAutomorphic(n,square,count);
		}

			

	}


	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(n==isAutomorphic(n,n*n,1));
	sc.close();

	}

}