class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans=Integer.MIN_VALUE;
        int l=1;
        int r=maximum(piles);
        while(l<=r)
        {
            int mid=(l+r)/2;
            int timeTaken=calculateTime(mid,piles);
            if(timeTaken<=h)
            {
                ans=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
    public int calculateTime(int b_per_hour,int arr[])
    {
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<b_per_hour)
            {
                total+=1;
            }
            else
            {
                int q=arr[i]/b_per_hour;
                total=total+q;
                if(arr[i]%b_per_hour!=0)
                {
                    total=total+1;
                }
            }
        }
        return total;
    }
   
    public int maximum(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    
}
