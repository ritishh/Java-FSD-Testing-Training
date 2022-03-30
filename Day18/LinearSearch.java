package Day18;

public class LinearSearch {
	
	// linerarly search x in arr[]. if x is present then
	// return the index, otherwise return -1
	
	static int search(int arr[],int n,int x)
	{
		int j;
		for(int i = 0;i<n;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	//Driver Program to test above functions
	
	public static void main(String[] args) 
	{
		int arr[] = {1,10,30,15};
		int x=30;
		int n = arr.length;
		System.out.printf("%d is present at index %d",x,search(arr,n,x));
		
	}

}
