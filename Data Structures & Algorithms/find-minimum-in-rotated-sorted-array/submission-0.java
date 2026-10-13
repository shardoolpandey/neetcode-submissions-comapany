class Solution {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int l=0;
        int r=nums.length-1;
        int arr[]=nums;
        while(l<=r)
        {
            if(arr[l]<=arr[r])
            {
                ans=Math.min(ans,arr[l]);
                break;
            }
            int mid=(l+r)/2;
            if(arr[l]<=arr[mid])
            {
                ans=Math.min(arr[l],ans);
                l=mid+1;
            }
            else if(arr[mid]<=arr[r])
            {
                ans=Math.min(arr[mid],ans);
                r=mid-1;
            }
        }
        return ans;
    }
}
