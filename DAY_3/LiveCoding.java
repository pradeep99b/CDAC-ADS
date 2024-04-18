// arr = {0,1,0,1,0,0,1,1,0,0,0,0,1,1,1,1}
// the subarray which has same number of zero and one in it.

import java.util.ArrayList;

public class LiveCoding{


	static int arr[] = {0,1,0,1,0,1,1,0,0,0,0,1,1,1,1};
	
	static void printSubarray(){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++){

			int count_zero=0;
			int count_one=0;
		
			if(arr[i]==0){
				count_zero++;
				al.add(0);
			}	
			else{
				count_one++;
				al.add(1);
			}
		
			
			if(count_zero==count_one)
			{
				for( Integer it:al)
					System.out.print(it+" " );
				System.out.print("\n");	


			}
			else
				al.remove(0);
		}
	}

	public static void main(String[] args){

		LiveCoding.printSubarray();
	}

}
		
		