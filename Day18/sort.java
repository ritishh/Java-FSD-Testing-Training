package Day18;



class sort 
{
	

	void merge(int arr[],int left,int middle,int right)
	{
		int low = middle - left+1; //size of the left subarray
		int high = right - middle; //size of the right subarray
		
		int L[] = new int[low];
		int R[] = new int[high];
		
		int i=0,j=0;
		
		for(i=0;i<low;i++)
		{
			L[i] = arr[left+i];
		}
		for(j=0;j<high;j++)
		{
			R[j] = arr[middle+1+j];
		}
		
		int k = left;
		i=0;
		j=0;
		
		while (i<low && j<high)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<low)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

	}
	void mergesort(int arr[],int left,int right)
	{
		int middle;
		if (left < right)
		{
			middle = (left+right)/2;
			
			mergesort(arr,left,middle);
			mergesort(arr,middle+1,right);
			
			merge(arr,left,middle,right);
		}
	}
	 void display(int arr[])                 //display the array
	    {  
	        for (int i=0; i<arr.length; ++i) 
	        {
	            System.out.print(arr[i]+" ");
	        } 
	    } 

	public static void main(String[] args) 
	{
		int arr[] = {9,3,1,5,13,12};
		sort  ob = new sort ();
		ob.mergesort(arr, 0,arr.length - 1);
		ob.display(arr);
	}
}
