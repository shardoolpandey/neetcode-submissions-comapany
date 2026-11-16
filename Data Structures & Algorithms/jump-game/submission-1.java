class Solution {
    public boolean canJump(int[] nums) {
        int arr[]=nums;
        int i=0;
        int maxInd=0;
        int n=arr.length;
        while(i<n)
        {
            if(i>maxInd)
            {
                return false;
            }
            if(maxInd>=(n-1))
            {
                return true;
            }
            maxInd=Math.max(maxInd,(arr[i]+i));
            i++;
        }
        if(maxInd>=(n-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
