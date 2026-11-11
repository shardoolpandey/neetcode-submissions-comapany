class Solution {
    public int maxProfit(int[] prices) {
        int arr[]=prices;
        int n=arr.length;
        int min=arr[0];
        int ans=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>min)
            {
                ans=ans+(arr[i]-min);
            }
            min=arr[i];
        }
        return ans;
    }
}