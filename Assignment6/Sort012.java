public class Sort012{


	public static void main(String[] args){


		int arr[] = { 0,2,1,2,1,0,0,0};

		int countZero = 0;
		int countOne = 0;	
		int countTwo = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 0)
				countZero++;
			else if(arr[i]==1)
				countOne++;
			else
				countTwo++;
		}


		int j =0;
		for(j=0;j<countZero;j++)
			System.out.print("0 ");
		for(j=0;j<countOne;j++)
			System.out.print(" 1 ");
		for(j=0;j<countTwo;j++)
			System.out.print(" 2 ");
	}
}
