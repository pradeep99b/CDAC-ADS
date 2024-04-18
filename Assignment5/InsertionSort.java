public class InsertionSort{


	static void insert(int arr[], int n){


	for(int i = 1;i<n;i++){

		int temp = arr[i];
		int j = i-1;
		while(	j>=0 && temp<arr[j] ){
		
			arr[j+1] = arr[j];
			j--;
		}

		arr[j+1] = temp;

	}

	}

	public static void main(String[] args){

	int arr[] = { 2,4,1,6,3,8};
	int n = arr.length;

	insert(arr,n);
	
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	
	}




}