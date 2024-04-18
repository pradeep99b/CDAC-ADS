public class HeapSort{


	static void heapify(int arr[],int n,int i){
	
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if(l<n && arr[largest] < arr[l])
			largest = l;
		if(r<n && arr[largest] < arr[r])
			largest = r;

		if(largest!=i){

		
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			heapify(arr,n,largest);


		}

	
	}




	static void heapSort(int arr[]){


		int n = arr.length;

		for( int i = n/2 -1 ; i>=0;i--)
			heapify(arr,n,i);

		for(int i =n-1 ;i>0;i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr,i,0);
		}			
			


	}


	static void display(int arr[], int n){

		for(int i =0;i<n;i++)
			System.out.print(arr[i]+" " );

	}


	public static void main(String[] args){

	HeapSort hs = new HeapSort();
	int arr[] = { 4,6,3,6,2,1};	
	int n = arr.length;
	
	hs.heapSort(arr);
	hs.display(arr,n);
	
	}
}





		