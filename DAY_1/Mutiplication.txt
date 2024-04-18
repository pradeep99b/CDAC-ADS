public class Multiplication{

	static int i =1;
	static int printmult(int n,int i){

		if(i==11)
			return 1;
		else
			System.out.println(n+"*"+i+"="+(n*i));

		return 1;
	}

	public static void main(String[] agrs){

		System.out.println(printmult(5));
	}

}