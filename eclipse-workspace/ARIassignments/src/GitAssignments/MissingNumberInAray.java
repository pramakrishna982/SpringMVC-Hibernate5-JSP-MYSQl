package GitAssignments;


public class MissingNumberInAray {
	
	public static int missingNumber(int[] arr,int n)
	{
		int sumofall=(n*(n+1))/2;
		int arrsum=0;
		int missing_number = 0;
		for(int i=0;i<arr.length;i++)
		{
			arrsum=arrsum+arr[i];
			missing_number=sumofall-arrsum;
		}
		return missing_number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,5};
		int[] arr2= {6,1,2,8,3,4,7,10,5};
		System.out.println("Missing Number in array1 is:"+missingNumber(arr1,5));
		System.out.println("Missing Number in array2 is:"+missingNumber(arr2,10));

	}

}