public class Recursion{

	
	static int i =0;

	static void repeat(){
		if(i<5){
			System.out.println(i);
			i++;
			repeat();
		}
		
	}

	public static void main(String args[]){
		
		repeat();
	}
}
		