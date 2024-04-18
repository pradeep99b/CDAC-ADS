import java.util.Scanner;
public class TowerofHanoi{

	static void noOfMoves(int n,char a,char c,char b){

		if(n==0)
			return ;

		noOfMoves(n-1,a,b,c);
		System.out.println("Move Disk"+n+" from rod "+a+" to rod "+c);
		noOfMoves(n-1,b,c,a);
		
	
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("No of Moves are: ");
		noOfMoves(n,'A','C','B');
		sc.close();
	
	}
}