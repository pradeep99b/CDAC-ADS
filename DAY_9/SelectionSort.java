public class SelectionSort{


	static void select(int arr[], int n){

		for(int i = 0 ;i<n;i++){

			for(int j =i+1;j<n;j++){

				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
	}


	public static void main(String[] args){

	int arr[] = {4,2,4,6,2,9};
	int n = arr.length;
	select(arr,n);

	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	
	}
}