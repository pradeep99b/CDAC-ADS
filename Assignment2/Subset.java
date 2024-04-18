public class Subset{

	
	static void substringFunction(String s,String current, int i){

		if(i==s.length()){
			System.out.println(current);
			return;
		}

		substringFunction(s,current,i+1);
		substringFunction(s,(current+(s.charAt(i))),i+1);

	
		

	}
	
	

	public static void main(String args[]){

	String current = "";
	substringFunction("ABC",current,0);
	

	}

}