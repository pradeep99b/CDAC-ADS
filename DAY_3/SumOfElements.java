public class SumOfElements{


	static void function(int arr[],int target){

		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;i++)
			{
				int sum=arr[i]+arr[j];
				if(sum==target){
					System.out.print("Elements at indices :"+i+" and "+j+" give the target");
					return;
				}
			}
			
		}
	}

				

	public static void main(String[] args){


		int arr[] = {2,7,11,15};
		int target = 9;

		function(arr,target);
	}
}