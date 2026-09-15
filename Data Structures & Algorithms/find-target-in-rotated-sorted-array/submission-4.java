class Solution {
    public int search(int[] nums, int target) {
        int arr[]=nums;
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                return mid;
            }
            else if(arr[l]<=arr[mid])
            {
                if(arr[l]<=target && target<=arr[mid])
                {
                    r=mid-1;
                }
                else 
                {
                    l=mid+1;
                }
            }
            else if(arr[mid]<=arr[r])
            {
                if(arr[mid]<=target && target<=arr[r])
                {
                    l=mid+1;
                }
                else
                {
                    r=mid-1;
                }
            }
        }
        return ans;
    }
}
