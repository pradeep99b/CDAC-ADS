public class BulbulaSort{

	static void bSort(int arr[], int n){


	for(int i = 0;i<n-1;i++){

		for(int j =0;j<n-i-1;j++){

			if(arr[j]>arr[j+1]){

				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			} 
		}
	}


	}


	public static void main(String[] args){


	int arr[] = { 3,9,21,10,10,27,1};
	int n = arr.length;
	bSort(arr,n);
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+"  ");
	
	}
}