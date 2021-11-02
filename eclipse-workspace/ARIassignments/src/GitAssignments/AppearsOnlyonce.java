package GitAssignments;

public class AppearsOnlyonce {
	
    static void search(int arr[], int n)
    {
        int ans = -1;
        for (int i = 0; i < n; i += 2) 
        {
            if (arr[i] != arr[i + 1]) 
            {
                ans = arr[i];
                break;
            }
        }
       
        if (arr[n - 2] != arr[n - 1])
            ans = arr[n-1];
        System.out.println("The required element is "
                           + ans);
    }
    public static void main(String[] args)
    {
    	int arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        int len = arr.length;
 
        search(arr, len);
    }
}
