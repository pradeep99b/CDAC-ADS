import java.util.Scanner;
public class Untitled{


	static char countFrequency(String s){


		
		int arr[] = new int[127];
		for(int i=0;i<s.length();i++)
			arr[s.charAt(i)]+=1;

		int max = Integer.MIN_VALUE;
		char ch = '*';
		for(int i=0;i<s.length();i++){
			if(arr[s.charAt(i)]>max){
				max = arr[s.charAt(i)];
				ch = s.charAt(i);
			}
		}


		return ch;

		

	}

	

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print("The most frequent element is : "+countFrequency(s));
		sc.close();
	}

}