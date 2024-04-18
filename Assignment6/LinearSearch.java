public class LinearSearch{

	
	static int search(int arr[], int n, int key){

		for(int i=0;i<n;i++){

			if(arr[i]==key)
				return i;
		}
		return -1;

	}

	public static void main(String[] args){

		int arr[] = {3,5,2,7,8};
		int n = arr.length;
		int key = 4;

		System.out.print("The key :"+key+" is at position: "+search(arr,n,key));

	}

}