public class TailSumArray{

	static int sumOfArray(int arr[],int n,int sum){

	   if (n == 0) 
        	return sum;
 
       	   return sumOfArray(arr, n- 1, sum + arr[n - 1]);

	}


	public static void main(String[] args){

	int arr[] = {1,2,3};
	int n=arr.length;
	int sum = sumOfArray(arr,n,0);
	System.out.println("Sum of array is: "+ sum);
	
	}
}