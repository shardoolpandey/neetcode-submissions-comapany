class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=nums;
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        arr1[0]=1;
        int i=1;
        int current=1;
        while(i<n)
        {
            arr1[i]=arr[i-1]*current;
            current=arr1[i];
            i++;
        }
        arr2[n-1]=1;
        i=n-2;
        current=1;
        while(i>=0)
        {
            arr2[i]=arr[i+1]*current;
            current=arr2[i];
            i--;
        }
        i=0;
        int ans[]=new int[n];
        while(i<n)
        {
            ans[i]=arr1[i]*arr2[i];
            i++;
        }
        return ans;
    }
}  
