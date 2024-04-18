import java.util.Scanner;
public class BinarySearch{

	
	static int search(int arr[], int key, int start, int end){

		if(start<=end){
		int mid = start + (end - start)/2 ;
		
	
		if(arr[mid] == key )
			return mid;
				
		else if(arr[mid]<key)
			return search(arr,key,mid+1,end);
		else
			return search(arr,key,start,mid-1);
		}
		else 
			return -1;

	}

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int arr[] = {1,2,3,4,5,6};
	int n = arr.length;
	
	System.out.print("Enter the key :");
	int key = sc.nextInt();
	System.out.println();

	int k = search(arr,key,0,n-1);
	
	if(k==-1)
		System.out.print("Element doesnot exist in the array ");
	else 	
		System.out.print("Element exists at position " + k +" in the array");

	}

}